package auta.website.dininghall_menu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dishController {

    @RequestMapping({"dish","dish/index","dish/index.html"})
    public String listDish(){
        return "Dish/Dish";
    }
}
