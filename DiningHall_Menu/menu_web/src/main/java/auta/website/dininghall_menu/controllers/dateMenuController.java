package auta.website.dininghall_menu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dateMenuController {

    @RequestMapping({"calendar","calendar/index","calendar/index.html"})
    public String listDateMenu(){
        return "DateMenu/DateMenu";
    }
}
