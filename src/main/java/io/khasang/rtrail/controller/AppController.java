package io.khasang.rtrail.controller;

import io.khasang.rtrail.model.CreateTable;
import io.khasang.rtrail.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
    @Autowired
    private Message message;

    @Autowired
    private CreateTable createTable;

    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("name", message.getInfo());
        return "index";
    }
    @RequestMapping("/create")
    public String getCreateTable(Model model){
       model.addAttribute("status", createTable.createTableStatus());
        return "create";
    }
    @RequestMapping(value = "/password/{password}",  method = RequestMethod.GET)
    public String getPasswordByEncode(@PathVariable("password") String password, Model model){
        model.addAttribute("pssword", password);
        model.addAttribute("encodePassword", new BCryptPasswordEncoder().encode(password));
        return "password";

    }
}
