package auta.website.dininghall_menu.model;

import java.util.Set;

public class Dish extends BaseEntity{

    private String name;

    private Set<DateMenu> dateMenus;

    private Set<Comment> comments;
    public Set<DateMenu> getDateMenus() {
        return dateMenus;
    }

    public void setDateMenus(Set<DateMenu> dateMenus) {
        this.dateMenus = dateMenus;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
