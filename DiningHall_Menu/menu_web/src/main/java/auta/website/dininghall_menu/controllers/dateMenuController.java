package auta.website.dininghall_menu.controllers;


import auta.website.dininghall_menu.model.DateMenu;
import auta.website.dininghall_menu.services.DateMenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dateMenuController {

    private final DateMenuService dateMenuService;

    public dateMenuController(DateMenuService dateMenuService) {
        this.dateMenuService = dateMenuService;
    }

    @RequestMapping({"calendar","calendar/index","calendar/index.html"})
    public String listDateMenu(Model model){

        model.addAttribute("menus", dateMenuService.findAll());
        return "DateMenu/DateMenu";
    }
}
