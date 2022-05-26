package auta.website.dininghall_menu.services.map;

import auta.website.dininghall_menu.model.Comment;
import auta.website.dininghall_menu.services.CrudService;

import java.util.Set;

public class CommentServiceMap extends AbstractMapService<Comment,Long> implements CrudService<Comment,Long> {

    @Override
    public Set<Comment> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Comment object) {
        super.delete(object);
    }

    @Override
    public Comment save(Comment object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Comment findById(Long id) {
        return super.findById(id);
    }
}
