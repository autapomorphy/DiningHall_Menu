package auta.website.dininghall_menu.services;

import auta.website.dininghall_menu.model.DateMenu;

public interface DateMenuService extends CrudService<DateMenu,Long> {

    DateMenu findByDate(String date);
}
