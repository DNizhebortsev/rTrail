package io.khasang.rtrail.controller;

import io.khasang.rtrail.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired

    private Message message;

    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("name", message.getInfo());
        return "index";
    }
}
