package com.example.casestudy.controller;

import com.example.casestudy.model.dto.RoomCreateDTO;
import com.example.casestudy.service.IFacilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FacilityController {
    @Autowired
    private IFacilityService service;
    @GetMapping("/facility")
    public String listFacility(Model model){
        model.addAttribute("listFacility", service.getAll());
        return "listFacility";
    }
    @PostMapping("/createRoom")
    public String RoomCreate(@Validated @ModelAttribute("roomCreateDTO") RoomCreateDTO roomCreateDTO){
        return "listFacility";
    }





}
