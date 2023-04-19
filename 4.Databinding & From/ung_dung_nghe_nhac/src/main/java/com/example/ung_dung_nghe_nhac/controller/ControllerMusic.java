package com.example.ung_dung_nghe_nhac.controller;
import com.example.ung_dung_nghe_nhac.model.Music;
import com.example.ung_dung_nghe_nhac.repository.RepositoryMusic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMusic {

    @GetMapping("/music")
    public String list(Model model) {
        model.addAttribute("music", RepositoryMusic.findAll());
        return "list";
    }

    @GetMapping("/music/create")
    public ModelAndView createFrom(Model model) {
        return new ModelAndView("create", "music", new Music());
    }

    @PostMapping("/music/create")
    public String createMusic(@ModelAttribute("music") Music music, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        if (checkStr(music.getPathMusic())) {
            RepositoryMusic.add(music);
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
