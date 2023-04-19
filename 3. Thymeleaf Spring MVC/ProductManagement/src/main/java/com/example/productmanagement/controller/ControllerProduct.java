package com.example.productmanagement.controller;
import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.IProductService;
import com.example.productmanagement.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ControllerProduct {
    private final IProductService service = new ProductService();
        @GetMapping("/product")
         public String list(Model model){
        List<Product> productList = service.findAll();
        model.addAttribute("productList", productList);
        return "/list";
        }
        @GetMapping("/product/create")
        public String showFormCreate(Model model){
            model.addAttribute("product", new Product());
            return "/create";
        }
        @GetMapping("/product/edit/{id}")
        public String showFormEdit(@PathVariable int id, Model model){
            model.addAttribute("product", service.findById(id));
            return "/edit";
        }
        @GetMapping("product/delete/{id}")
        public String showFormDelete(@PathVariable int id, Model model){
            model.addAttribute("product", service.findById(id));
            return "/delete";
        }
        @PostMapping("/product/create")
        public String createProduct(Model model, @ModelAttribute("product") Product product, BindingResult result){
            if (result.hasErrors()){
                return "create";
            }
            service.save(product);
            return list(model);
        }
        @PostMapping("/product/edit")
        public String editProduct( Product product, BindingResult result){
            if (result.hasErrors()){
                return "edit";
            }
            service.update(product.getId(), product);
            return "redirect:/product";
        }
        @PostMapping("/product/delete")
        public String deleteProduct(Product product, RedirectAttributes redirect){
            service.remove(product.getId());
            redirect.addFlashAttribute("success","Removed customer successfully!");
            return "redirect:/product";

        }



}
