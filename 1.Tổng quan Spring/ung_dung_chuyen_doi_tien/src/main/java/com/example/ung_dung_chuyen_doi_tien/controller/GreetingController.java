package com.example.ung_dung_chuyen_doi_tien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class GreetingController {
@GetMapping("/exchange")
    public String usdFromVnd(){
    return "show";

}
@PostMapping("/exchange")
    public String exchange(@RequestParam("usd") String usd , RedirectAttributes redirect){
    double usdDoble = Double.parseDouble(usd);
    double vnd = usdDoble*23000;
    redirect.addFlashAttribute("vnd", vnd);
    return "redirect:/exchange";
}

}
