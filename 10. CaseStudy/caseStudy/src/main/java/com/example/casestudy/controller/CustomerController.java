package com.example.casestudy.controller;

import com.example.casestudy.model.customerModel.Customer;
import com.example.casestudy.dto.CustomerCreateDTO;
import com.example.casestudy.service.ICustomerService;
import com.example.casestudy.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;
    @GetMapping("/customer")
    public String modelAndView(Model model, @RequestParam(defaultValue = "0") int page){
        if (page < 0){
            page = 0;
        }
        model.addAttribute("customerList", customerService.listAll(page));
        return "listCustomers";
    }
    @GetMapping("/createCustomer")
    public String showForm(Model model){
        model.addAttribute("customerCreateDTO", new CustomerCreateDTO());
        model.addAttribute("customerType",customerTypeService.getAll());
        return "createCustomer";
    }
    @PostMapping("/createCustomer")
    public String customerCreate(@Validated @ModelAttribute("customerCreateDTO") CustomerCreateDTO customerCreateDTO,
                             BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");
            return "createCustomer";
        }
        Customer customer = new Customer();
        customerCreateDTO.getBirthDay();
        BeanUtils.copyProperties( customerCreateDTO, customer);
        customerService.save(customer);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/createCustomer";
    }
    @GetMapping("/customer/delete/{id}")
    public String deleteBlog(Model model,@PathVariable int id) {
        model.addAttribute("customer", customerService.findById(id));
        return "listCustomers";
    }
    @PostMapping("/customer/delete")
    public String confirmDelete(@ModelAttribute("customer") Customer customer,
                                RedirectAttributes redirectAttributes){
        customerService.delete(customer.getId());
        redirectAttributes.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/listCustomers";

    }
    @GetMapping("/customer/detail/{id}")
    public String detailCustomer(Model model, @PathVariable int id){
        model.addAttribute("customer", customerService.findById(id));
        return "deleteCustomer";
    }
    @PostMapping("/customer/detail")
    public String confirmDetail(@Validated @ModelAttribute("customerCreateDTO")
                                    CustomerCreateDTO customerCreateDTO,
                                BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");
            return "detailCustomer";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties( customerCreateDTO, customer);
        customerService.save(customer);
        redirect.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/detailCustomer";

    }






}
