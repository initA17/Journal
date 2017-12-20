package com.journal.test.Service;

import com.journal.test.module.IHaveID;
import com.journal.test.module.Student;

public class StudentCRUD extends BaseCRUD {
    private static Integer id = 0;

    public StudentCRUD(){
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
    public Student read(IHaveID obj) {
        return (Student) get(obj.getId());
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
