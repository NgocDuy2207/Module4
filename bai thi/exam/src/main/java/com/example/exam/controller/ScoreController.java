package com.example.exam.controller;

import com.example.exam.model.Score;
import com.example.exam.model.Student;
import com.example.exam.service.IScoreService;
import com.example.exam.service.IStudentService;
import com.example.exam.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ScoreController {
    @Autowired
    private IScoreService scoreService;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private ISubjectService subjectService;
    @GetMapping("/score")
    public String listScore(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("listScore",scoreService.listAll(page));
        return "listScore";
    }

    @GetMapping("/createScore")
    public String showForm(Model model){
        model.addAttribute("score", new Score());
        model.addAttribute("students", studentService.getAll());
        model.addAttribute("subjects", subjectService.getAll());
        return "createScore";
    }
    @PostMapping("/createScore")
    public String customerCreate(@Validated @ModelAttribute("score") Score score,
                                 BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");
            return "createScore";
        }
        scoreService.save(score);
        redirect.addFlashAttribute("message", "thêm mới thành công");
        return "redirect:/score";
    }
    @GetMapping("/search")
    public String search(Model model, @Param("name") String name,@RequestParam(defaultValue = "0") int page){
        model.addAttribute("listScore", scoreService.findByNameStudent(page, "%"+ name+ "%"));
        return "listScore";
    }

//    @GetMapping(value = "/search-student")
//    public ModelAndView showListSearch(@PageableDefault(value = 3, sort = "studentName") Pageable pageable, @RequestParam(value = "search-student", required = false) String name) {
//        Page<Student> students = studentService.findByName(pageable, "%" + name + "%");
//        ModelAndView modelAndView = new ModelAndView("view/student/search-student");
//        modelAndView.addObject("students", students);
//        if (students.getContent().size() == 0) {
//            modelAndView.addObject("message", " There is no found result !");
//        }
//        return modelAndView;
//    }
}
