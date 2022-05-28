package auta.website.dininghall_menu.services.map;

import auta.website.dininghall_menu.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {


    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId()==null){
                object.setId(getNextEmptyId());
            }
            map.put(object.getId(), object);
        }
        else{
            throw new RuntimeException("null object");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    Long getNextEmptyId(){
        if(map.size()==0){
            return 1L;
        }
        else{
            return Collections.max(map.keySet())+1;
        }
    }

}
