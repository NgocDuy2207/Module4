package com.example.sandwich.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SandWichController {
    @RequestMapping("/")
    public String listIndex(){
        return "index";
    }
    @GetMapping(path = "/save")
    public String save(Model model, @RequestParam("condiment") String[] condiment){
        model.addAttribute("condiment", condiment);
        return "save";
    }
}
