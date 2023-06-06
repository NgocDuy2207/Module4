package com.example.casestudy.controller;
import com.example.casestudy.dto.HouseCreateDTO;
import com.example.casestudy.dto.RoomCreateDTO;
import com.example.casestudy.dto.VillaCreateDTO;
import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.model.serviceModel.FacilityType;
import com.example.casestudy.service.IFacilityService;
import com.example.casestudy.service.IRentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping("/facility")
    public String listFacility(Model model, @RequestParam(defaultValue = "0") int page){
        if (page < 0){
            page = 0;
        }
        model.addAttribute("roomCreateDTO", new RoomCreateDTO());
        model.addAttribute("houseCreateDTO", new HouseCreateDTO());
        model.addAttribute("villaCreateDTO", new VillaCreateDTO());
        model.addAttribute("listFacility", facilityService.listAll(page));
        model.addAttribute("rentTypeList", rentTypeService.getAll());
        return "service";
    }

    // create Room
    @PostMapping("/createRoom")
    public String RoomCreate(@Validated @ModelAttribute("roomCreateDTO") RoomCreateDTO roomCreateDTO,
                             BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("err", "lỗi");
            return "redirect:/facility";
        }
        Facility facility = new Facility();
        facility.setFacilityType(new FacilityType(3, "Room"));
        BeanUtils.copyProperties(roomCreateDTO, facility);
        facilityService.save(facility);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/facility";
    }
    // create House
    @PostMapping("/createHouse")
    public String RoomHouse(@Validated @ModelAttribute("houseCreateDTO") HouseCreateDTO houseCreateDTO,
                             BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            return "redirect:/service";
        }
        Facility facility = new Facility();
        facility.setFacilityType(new FacilityType(2,"House"));
        BeanUtils.copyProperties(houseCreateDTO, facility);
        facilityService.save(facility);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/facility";
    }
    // create Villa
    @PostMapping("/createVilla")
    public String RoomVilla(@Validated @ModelAttribute("villaCreateDTO") VillaCreateDTO villaCreateDTO,
                             BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            return "redirect:/service";
        }
        Facility facility = new Facility();
        facility.setFacilityType(new FacilityType(1,"Villa"));
        BeanUtils.copyProperties( villaCreateDTO, facility);
        facilityService.save(facility);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/facility";
    }







}
