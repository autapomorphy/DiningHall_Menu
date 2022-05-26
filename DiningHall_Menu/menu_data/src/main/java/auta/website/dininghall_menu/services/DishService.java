package auta.website.dininghall_menu.services;

import auta.website.dininghall_menu.model.Dish;

public interface DishService extends CrudService<Dish,Long> {

    Dish findByName(String name);

}
