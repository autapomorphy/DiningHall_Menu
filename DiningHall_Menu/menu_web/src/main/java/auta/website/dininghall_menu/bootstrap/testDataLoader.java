package auta.website.dininghall_menu.bootstrap;

import auta.website.dininghall_menu.model.DateMenu;
import auta.website.dininghall_menu.model.Dish;
import auta.website.dininghall_menu.model.MenuType;
import auta.website.dininghall_menu.services.DateMenuService;
import auta.website.dininghall_menu.services.DishService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class testDataLoader implements CommandLineRunner {

    private final DateMenuService dateMenuService;
    private final DishService dishService;

    public testDataLoader(DateMenuService dateMenuService, DishService dishService) {
        this.dateMenuService = dateMenuService;
        this.dishService = dishService;
    }

    @Override
    public void run(String... args) throws Exception {

        MenuType breakfast = new MenuType();
        breakfast.setName("breakfast");
        DateMenu dateMenu1 = new DateMenu();
        dateMenu1.setDate("May 28 2022");
        dateMenu1.setType(breakfast);

        dateMenuService.save(dateMenu1);

        DateMenu dateMenu2 = new DateMenu();
        dateMenu2.setDate("May 29 2022");
        dateMenu2.setType(breakfast);

        dateMenuService.save(dateMenu2);

        System.out.println("Loading menus..");

        Dish dish1 = new Dish();
        dish1.setName("Steak");

        dishService.save(dish1);

        Dish dish2 = new Dish();
        dish2.setName("Fries");

        dishService.save(dish2);

        System.out.println("Loading dishes..");
    }
}
