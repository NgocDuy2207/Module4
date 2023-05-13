package com.example.managerbook.controller;
import com.example.managerbook.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.rmi.MarshalledObject;

@Controller
public class ControllerBook {
    @Autowired
    private IBookService service;
    @GetMapping("/book")
    public String ModelAndView(Model model){
        model.addAttribute("listBook", service.getAll());
        return "listBook";
    }

}
