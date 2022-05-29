package auta.website.dininghall_menu.controllers;


import auta.website.dininghall_menu.services.DishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dishController {

    private final DishService dishService;

    public dishController(DishService dishService) {
        this.dishService = dishService;
    }

    @RequestMapping({"dish","dish/index","dish/index.html"})
    public String listDish(Model model){

        model.addAttribute("dishes",dishService.findAll());
        return "Dish/Dish";
    }
}
