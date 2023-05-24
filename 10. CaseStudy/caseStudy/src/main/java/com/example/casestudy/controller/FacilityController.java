package com.example.casestudy.controller;

import com.example.casestudy.model.dto.RoomCreateDTO;
import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.service.IFacilityService;
import com.example.casestudy.service.IRentTypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    private IRentTypeService rentTypeService;
    @GetMapping("/facility")
    public String listFacility(Model model){
        model.addAttribute("listFacility", facilityService.getAll());
        return "service";
    }
    @GetMapping("/createRoom")
    public String ModelAndView(Model model){
        model.addAttribute("roomCreateDTO", new RoomCreateDTO());
//        model.addAttribute("rentTypeList", rentTypeService.getAll());
        return "createRoom";
    }
    @PostMapping("/facility/room")
    public String RoomCreate(@Validated @ModelAttribute("roomCreateDTO") RoomCreateDTO roomCreateDTO,
                             BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            return "createRoom";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties( roomCreateDTO, facility);
        facilityService.save(facility);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/createRoom";
    }





}
