package auta.website.dininghall_menu.services.map;

import auta.website.dininghall_menu.model.Dish;
import auta.website.dininghall_menu.services.CrudService;
import auta.website.dininghall_menu.services.DishService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class DishServiceMap extends AbstractMapService<Dish,Long> implements DishService {

    @Override
    public Set<Dish> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Dish object) {
        super.delete(object);
    }

    @Override
    public Dish save(Dish object) {
        return super.save(object);
    }

    @Override
    public Dish findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Dish findByName(String name) {
        return null;
    }
}
