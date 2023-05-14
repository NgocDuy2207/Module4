package com.example.managerbook.controller;
import com.example.managerbook.service.IBookService;
import com.example.managerbook.service.IBorrow;
import com.example.managerbook.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerBorrow {

    @Autowired
    private IBookService iBookService;
    @Autowired
    private IStudentService iStudentService;
    @Autowired
    private IBorrow iBorrow;
    @GetMapping("/student")
    public String ListStudent(Model model){
        model.addAttribute("listStudent", iStudentService.getAll());
        return "listStudent";
    }
    @GetMapping("/book/borrow/{id}")
    public String ListBook(Model model, @PathVariable int id){
        model.addAttribute("listBook", iBookService.getAll());
        return "listBook";
    }






}
