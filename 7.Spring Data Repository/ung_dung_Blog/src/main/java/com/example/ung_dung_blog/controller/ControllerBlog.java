package com.example.ung_dung_blog.controller;
import com.example.ung_dung_blog.model.Blog;
import com.example.ung_dung_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ControllerBlog {
    @Autowired
    private IBlogService service;

    @GetMapping("/blog")
    public String ModelAndView(Model model, @RequestParam(defaultValue = "0") int page) {
        if (page < 0) {
            page = 0;
        }
        model.addAttribute("blogList", service.findAll(page));
        return "list";
    }

    @GetMapping("/blog/detail/{id}")
    public String BlogDetail(Model model, @PathVariable int id) {
        model.addAttribute("blogDetail", service.findById(id));
        return "detail";
    }
    @GetMapping("/blog/create")
    public ModelAndView ShowFromCreate(Model model){
        return new ModelAndView("create", "blog", new Blog());
    }

    @GetMapping("/blog/delete/{id}")
    public String DeleteBlog(Model model,@PathVariable int id) {
        model.addAttribute("blog", service.findById(id));
        return "delete";
    }

    @PostMapping("/blog/delete")
    public String deleteBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes attributes) {
        service.remove(blog.getId());
        attributes.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/blog";

    }
}
