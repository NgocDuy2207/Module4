package com.example.casestudy.controller;

import com.example.casestudy.model.customerModel.Customer;
import com.example.casestudy.model.customerModel.CustomerType;
import com.example.casestudy.model.dto.CustomerCreateDTO;
import com.example.casestudy.model.dto.RoomCreateDTO;
import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.service.ICustomerService;
import com.example.casestudy.service.ICustomerTypeService;
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
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;
    @GetMapping("/customer")
    public String ModelAndView(Model model){
        model.addAttribute("customerList", customerService.getAll());
        return "listCustomers";
    }
    @GetMapping("/createCustomer")
    public String ShowForm(Model model){
        model.addAttribute("customerCreateDTO", new CustomerCreateDTO());
        model.addAttribute("customerType",customerTypeService.getAll());
        return "createCustomer";
    }
    @PostMapping("/createCustomer")
    public String CustomerCreate(@Validated @ModelAttribute("customerCreateDTO") CustomerCreateDTO customerCreateDTO,
                             BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");
            return "createCustomer";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties( customerCreateDTO, customer);
        customerService.save(customer);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "listCustomers";
    }




}
