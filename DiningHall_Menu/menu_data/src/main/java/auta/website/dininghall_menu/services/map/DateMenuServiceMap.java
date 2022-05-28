package auta.website.dininghall_menu.services.map;

import auta.website.dininghall_menu.model.DateMenu;
import auta.website.dininghall_menu.services.CrudService;
import auta.website.dininghall_menu.services.DateMenuService;

import java.util.Set;

public class DateMenuServiceMap extends AbstractMapService<DateMenu,Long> implements DateMenuService {
    @Override
    public Set<DateMenu> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(DateMenu object) {
        super.delete(object);
    }

    @Override
    public DateMenu save(DateMenu object) {
        return super.save(object);
    }

    @Override
    public DateMenu findById(Long id) {
        return super.findById(id);
    }

    @Override
    public DateMenu findByDate(String date) {
        return null;
    }
}
