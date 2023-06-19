package com.example.exam.controller;

import com.example.exam.model.Student;
import com.example.exam.service.IStudentService;
import org.springframework.beans.BeanUtils;
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

import java.util.List;

@Controller
public class StudentController {
   @Autowired
   private IStudentService serviceStudent;
   @GetMapping("/student")
   public String listStudent(Model model, @RequestParam(defaultValue = "0") int page){
       model.addAttribute("listStudent", serviceStudent.listAll(page));
       return "listStudent";
   }

    @GetMapping("/createStudent")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "createStudent";
    }
    @PostMapping("/createStudent")
    public String customerCreate(@Validated @ModelAttribute("student") Student student,
                                 BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");

            return "createStudent";
        }
        List<Student> studentList = serviceStudent.findByIdStudent(student.getIdStudent());
        if ((student.getIdStudent()).equals(studentList)==true){
            redirect.addFlashAttribute("error", "idStudent không được trùng");
            return "createStudent";
        }else {
            serviceStudent.save(student);
        }

        redirect.addFlashAttribute("message", "thêm mới thành công");
        return "redirect:/student";
    }
}

