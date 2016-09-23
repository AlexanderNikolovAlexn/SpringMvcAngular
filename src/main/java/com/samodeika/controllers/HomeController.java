package com.samodeika.controllers;

import com.samodeika.services.MenuService;
import com.samodeika.services.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    MenuService menuService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("menu", menuService.getMenus());
        return "index";
    }

}
