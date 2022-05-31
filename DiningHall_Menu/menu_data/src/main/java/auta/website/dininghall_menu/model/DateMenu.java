package auta.website.dininghall_menu.model;

import java.util.Set;

public class DateMenu extends BaseEntity{

    private String date;

    private MenuType type;

    private Set<Dish> dishes;

    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
}
