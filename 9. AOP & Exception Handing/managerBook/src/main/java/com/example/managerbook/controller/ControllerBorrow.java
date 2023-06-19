package com.example.managerbook.controller;
import com.example.managerbook.dto.DTO;
import com.example.managerbook.model.Book;
import com.example.managerbook.model.BorrowBookOfStudent;
import com.example.managerbook.service.IBookService;
import com.example.managerbook.service.IBorrow;
import com.example.managerbook.service.IStudentService;
import com.example.managerbook.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControllerBorrow {

    @Autowired
    private IBookService iBookService;
    @Autowired
    private IStudentService iStudentService;
    @Autowired
    private IBorrow iBorrow;
    @GetMapping("/student")
    public String ListStudent(Model model){
        model.addAttribute("listStudent", iStudentService.getAll());
        return "listStudent";
    }
    @GetMapping("/book")
    public String ListBook(Model model){
        model.addAttribute("listBook", iBookService.getAll());
        return "listBook";
    }
    @GetMapping("/borrow/{id}")
    public String BorrowBook(Model model, @PathVariable int id){
        Book book =  iBookService.findById(id);
        DTO dto =new DTO();
        dto.setBookID(book);
        model.addAttribute("DTO", dto);
        model.addAttribute("book", iBookService.findById(id));
        model.addAttribute("listStudent", iStudentService.getAll());
        return "borrow";
    }
    @PostMapping("/borrow/create")
    public String BorrowBookCreate(@ModelAttribute("DTO") DTO dto, BindingResult bindingResult,
                             RedirectAttributes redirect, Model model){
        if (bindingResult.hasErrors()){
            return "borrow";
        }
        BorrowBookOfStudent borrowBookOfStudent = new BorrowBookOfStudent();
        borrowBookOfStudent.setBorrowCode(Utils.RandomStringGenerator());
        borrowBookOfStudent.setBook(dto.getBookID());
        borrowBookOfStudent.setStudent(dto.getStudentsID());
        borrowBookOfStudent.setStatus(true);
        int id = dto.getBookID().getIdBook();
        Book book =  iBookService.findById(id);
        int quantity = book.getQuantity();
        if (quantity > 0){
            iBorrow.create(borrowBookOfStudent);
            quantity = Utils.decrease(quantity);
            book.setQuantity(quantity);
            iBookService.save(book);
        }else {
            redirect.addFlashAttribute("msg", "hết sách");
        }
        return "borrowList";
    }









}
