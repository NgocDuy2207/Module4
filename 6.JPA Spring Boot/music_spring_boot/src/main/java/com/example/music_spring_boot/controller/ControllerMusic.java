package com.example.music_spring_boot.controller;
import com.example.music_spring_boot.dto.MusicCreateDTO;
import com.example.music_spring_boot.model.Music;
import com.example.music_spring_boot.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
        model.addAttribute("musicList", service.getAll());
        return "list";
    }

    @GetMapping("/music/create")
    public ModelAndView createFrom() {
        return new ModelAndView("create", "musicCreateDTO", new MusicCreateDTO());
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
    public String createMusic(@Validated @ModelAttribute("musicCreateDTO") MusicCreateDTO musicCreateDTO,
                              Model model, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "create";
//        }
        Music music = new Music();
        if (checkStr(musicCreateDTO.getPathMusic())) {
            BeanUtils.copyProperties(musicCreateDTO, music);
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
        } else {
            isCheck = false;
        }
        return isCheck;
    }
}
