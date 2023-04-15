package com.example.caculator.controller;


import com.example.caculator.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @RequestMapping("")
    public String index(){
        return "index";
    }
    @PostMapping("")
    public String calculator(@RequestParam("firstOperand") float firstOperand,
                             @RequestParam("operator") char operator,
                             @RequestParam("secondOperand") float secondOperand,
                             RedirectAttributes attributes){

        float result = Calculator.calculator(firstOperand, secondOperand, operator);
       attributes.addFlashAttribute("result", result);
       attributes.addFlashAttribute("firstOperand", firstOperand);
       attributes.addFlashAttribute("secondOperand", secondOperand);
        return "redirect:/";
    }
}
