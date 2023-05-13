package com.example.ung_dung_nghe_nhac.controller;
import com.example.ung_dung_nghe_nhac.model.Music;
import com.example.ung_dung_nghe_nhac.repository.RepositoryMusic;
import com.example.ung_dung_nghe_nhac.service.IMusicService;
import com.example.ung_dung_nghe_nhac.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControllerMusic {

    @Autowired
    private IMusicService service;

    @GetMapping("/music")
    public String list(Model model) {
        model.addAttribute("musicList", service.findAll());
        return "list";
    }

    @GetMapping("/music/create")
    public ModelAndView createFrom(Model model) {
        return new ModelAndView("create", "music", new Music());
    }
    @GetMapping("/music/update/{id}")
    public String updateMusic(Model model, @PathVariable int id){
        model.addAttribute("music", service.findById(id));
        return "update";
    }
    @GetMapping("/music/delete/{id}")
    public String deleteMusic(Model model, @PathVariable int id){
      model.addAttribute("music", service.findById(id));
      return "delete";
    }
    @PostMapping("/music/delete")
    public String deleteMusic(@ModelAttribute("music") Music music, RedirectAttributes attributes ){
        service.remove(music.getId());
        attributes.addFlashAttribute("success","Removed customer successfully!");
        return "redirect:/music";
    }
    @PostMapping("/music/update")
    public String updateMusic(Music music, BindingResult result, Model model){
        if (result.hasErrors()){
            return "update";
        }
        if (checkStr(music.getPathMusic())){
            service.update(music.getId(), music);
        }else {
            model.addAttribute("success","vui long nhap lai duong link");
            return "update";
        }
            model.addAttribute("success", "update thành công");
            return list(model);

    }
    @PostMapping("/music/create")
    public String createMusic(@ModelAttribute("music") Music music, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        if (checkStr(music.getPathMusic())) {
            service.save(music);
            model.addAttribute("success", "create thanh cong");
        } else {
            return "create";
        }
        return list(model);
    }


    public boolean checkStr(String str) {
        boolean isCheck = false;
        if (str.endsWith(".ogg") || str.endsWith(".mp3") || str.endsWith(".wav") || str.endsWith(".m4p")) {
            isCheck = true;
            return isCheck;
        } else {
            isCheck = false;
        }
        return isCheck;
    }
}
