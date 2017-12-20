package com.journal.test.Service;

import com.journal.test.module.Group;
import com.journal.test.module.IHaveID;

public class GroupCRUD extends BaseCRUD {
    private static Integer id = 0;

    public GroupCRUD(){
        super();
    }

    @Override
    public boolean create(IHaveID obj){
        try {
            obj.setId(id + 1);
            serviceMap.add(obj);
            id += 1;
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }

    @Override
    public Group read(IHaveID obj) {
        return (Group) get(obj.getId());
    }

    @Override
    public void update(IHaveID oldObj, IHaveID newObj) {
        try {
            serviceMap.update(oldObj.getId(), newObj);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(IHaveID obj) {
        try {
            serviceMap.delete(obj.getId());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
