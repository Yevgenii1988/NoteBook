package com.notebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("title", "NoteBook");
        model.addAttribute("tagline", "The best way to keep your notes");

        return "welcome";
    }
}
