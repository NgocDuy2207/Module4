package com.example.exam.controller;

import com.example.exam.model.Student;
import com.example.exam.model.Subject;
import com.example.exam.service.IStudentService;
import com.example.exam.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SubjectController {
    @Autowired
    private ISubjectService subjectService;
    @GetMapping("/subject")
    public String listStudent(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("listStudent", subjectService.listAll(page));
        return "listSubject";
    }

    @GetMapping("/createSubject")
    public String showForm(Model model){
        model.addAttribute("subject", new Subject());
        return "createSubject";
    }
    @PostMapping("/createSubject")
    public String customerCreate(@Validated @ModelAttribute("student") Subject subject,
                                 BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");
            return "createSubject";
        }
        subjectService.save(subject);
        redirect.addFlashAttribute("message", "thêm mới thành công");
        return "redirect:/subject";
    }
}
