package com.example.user.controller;


import com.example.user.model.User;
import com.example.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller

public class ControllerUser {
    @Autowired
    private IUserService service;
    @GetMapping("/user")
    public String showUser(Model model){
        model.addAttribute("user", service.getAll());
        return "list";
    }
    @GetMapping("create")
    public ModelAndView ShowFromCreate(Model model){
        return new ModelAndView("create", "user", new User());
    }
    @PostMapping("/user/create")
    public String Create(@Validated @ModelAttribute("user") User user, BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("smg","thêm mới không thành công");
            return "create";
        }
        service.save(user);
        redirect.addFlashAttribute("success", "Thêm mới thành công");
        return "redirect:/user";


    }

}
