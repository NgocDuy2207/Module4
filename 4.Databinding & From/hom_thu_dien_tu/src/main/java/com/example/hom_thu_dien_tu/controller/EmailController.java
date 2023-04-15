package com.example.hom_thu_dien_tu.controller;

import com.example.hom_thu_dien_tu.model.Email;
import com.example.hom_thu_dien_tu.repository.EmailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailController {


    @GetMapping("email")
    public String list(Model model) {
        model.addAttribute("listEmail", EmailRepository.findAll());
        return "list";
    }

    @GetMapping("/email/update")
    public String showForm(Model model) {
        model.addAttribute("email", new Email());
        model.addAttribute("languages", new String[]{"Vietnamese", "English", "Japanese", "Chinese"});
        model.addAttribute("pageSize", new Integer[]{5, 10, 15, 25, 50, 100});
        return "index";
    }

    @PostMapping("/email/update")
    public String updateEmail(@ModelAttribute("email") Email email, Model model, RedirectAttributes redirect) {
        model.addAttribute("languages", new String[]{"Vietnamese", "English", "Japanese", "Chinese"});
        model.addAttribute("pageSize", new Integer[]{5, 10, 15, 25, 50, 100});
        EmailRepository.add(email);
        redirect.addFlashAttribute("msg", "update thành công");
        return "index";
    }
}
