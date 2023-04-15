package com.example.ung_dung_tu_dien.controller;


import com.example.ung_dung_tu_dien.repository.RepositoryMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ExchangeController {

    @GetMapping("/exchange")
    public String show(){
        return "showEngFromVn";
    }
    @PostMapping("/exchange")
    public  String exchangeEn(Model model,  @RequestParam("vn") String vn, RedirectAttributes redirect) {
        String eng = RepositoryMap.findByKey(vn);
        redirect.addFlashAttribute("eng", eng);
        return "redirect:/exchange";

//
    }

}
