package com.blu4ck.converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Merhaba, Thymeleaf ile ilk arayüz!");
        return "greeting"; // greeting.html şablon dosyasına yönlendirir
    }
}
