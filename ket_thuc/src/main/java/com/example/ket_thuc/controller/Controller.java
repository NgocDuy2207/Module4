package com.example.ket_thuc.controller;
import com.example.ket_thuc.model.GiaoDichNhaDat;
import com.example.ket_thuc.service.IServiceKhachHang;
import com.example.ket_thuc.service.IServiceGiaoDichNhaDat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IServiceGiaoDichNhaDat serviceGiaoDichNhaDat;
    @Autowired
    private IServiceKhachHang serviceKhachHang;
    @GetMapping("/home")
        public String list(Model model, @RequestParam(defaultValue = "0") int page){
            model.addAttribute("listGiaoDich",serviceGiaoDichNhaDat.listAll(page));
            model.addAttribute("listKh",serviceKhachHang.listAll());
            return "list";

    }
    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute("listGiaoDich", new GiaoDichNhaDat());
        model.addAttribute("listKh",serviceKhachHang.listAll());
        return "create";
    }
    @PostMapping("/create")
    public String createQuesiton(@Validated @ModelAttribute("listGiaoDich") GiaoDichNhaDat giaoDichNhaDat,
                                 BindingResult result, RedirectAttributes redirect){
        if (result.hasErrors()){
            redirect.addFlashAttribute("error", "lỗi");
            return "create";
        }
        serviceGiaoDichNhaDat.save(giaoDichNhaDat);
        redirect.addFlashAttribute("message", "thêm mới thành công");
        return "redirect:/home";
    }
    @GetMapping("/home/delete/{id}")
    public String deleteCustomer(Model model,@PathVariable int id) {
        model.addAttribute("listGiaoDich", serviceGiaoDichNhaDat.finById(id));
        return "delete";
    }
    @GetMapping("/home/detail/{id}")
    public String detail(Model model,@PathVariable int id) {
        model.addAttribute("listGiaoDich", serviceGiaoDichNhaDat.finById(id));
        return "detail";
    }
    @PostMapping("/home/delete")
    public String confirmDelete(@ModelAttribute("listGiaoDich") GiaoDichNhaDat giaoDichNhaDat,
                                RedirectAttributes redirectAttributes, BindingResult result){
        if (result.hasErrors()){
            redirectAttributes.addFlashAttribute("message", "loi validation");
            return "delete";
        }
        serviceGiaoDichNhaDat.delete(giaoDichNhaDat.getId());
        redirectAttributes.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/home";
    }
    @GetMapping("/search")
    public String search(Model model, @Param("loaiDicVu") String loaiDicVu, @Param("maKh") String maKh, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("listGiaoDich", serviceGiaoDichNhaDat.findTenKhAndLoaiDichVu(page, "%" + maKh + "%", "%" + loaiDicVu + "%"));
        model.addAttribute("listKh",serviceKhachHang.listAll());
        return "list";
    }
    @GetMapping("/searchTen")
    public String searchTen(Model model, @Param("maKh") String maKh, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("listGiaoDich", serviceGiaoDichNhaDat.findByTenKhachHang(page,"%" + maKh +"%"));
        model.addAttribute("listKh",serviceKhachHang.listAll());
        return "list";
    }
    @GetMapping("/searchLoaiDichVu")
    public String searchLoaiDichVu(Model model, @Param("loaiDicVu") String loaiDicVu, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("listGiaoDich", serviceGiaoDichNhaDat.findLoaiDichVu(page,"%" + loaiDicVu +"%"));
        model.addAttribute("listKh",serviceKhachHang.listAll());
        return "list";
    }


}
