package auta.website.dininghall_menu.services.map;

import auta.website.dininghall_menu.model.Comment;
import auta.website.dininghall_menu.services.CommentService;
import auta.website.dininghall_menu.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CommentServiceMap extends AbstractMapService<Comment,Long> implements CommentService {

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
        return super.save(object);
    }

    @Override
    public Comment findById(Long id) {
        return super.findById(id);
    }
}
