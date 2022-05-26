package auta.website.dininghall_menu.model;

public class DateMenu extends BaseEntity{

    private String date;

    private MenuType type;

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
