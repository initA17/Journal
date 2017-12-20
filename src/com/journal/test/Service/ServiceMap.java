package com.journal.test.Service;

import java.util.HashMap;
import com.journal.test.module.*;

import javax.management.openmbean.KeyAlreadyExistsException;

// Принцип збереження в HashMap для всіх однаковий змінюється лише CRUD
// Уникнення дублювання
// Open close principe, Single responsibility principe are supported

public class ServiceMap {
    private HashMap<Integer, IHaveID> hashMap;

    public ServiceMap() {
        this.hashMap = new HashMap<Integer, IHaveID>();
    }

    public void add(IHaveID obj) throws KeyAlreadyExistsException {
        if(!hashMap.containsKey(obj.getId()))
            hashMap.put(obj.getId(), obj);
        throw new KeyAlreadyExistsException("Obj with such key already exists");
    }

    public IHaveID get(int id) throws KeyAlreadyExistsException {
        if(hashMap.containsKey(id)){
            return hashMap.get(id);
        }
        return null;
    }

    public void update(int id, IHaveID obj) throws KeyAlreadyExistsException {
        if(hashMap.containsKey(id)){
            hashMap.remove(id);
            hashMap.put(id, obj);
        }
        throw new KeyAlreadyExistsException("There is no obj with such id");
    }

    public void delete(int id) throws KeyAlreadyExistsException {
        if(hashMap.containsKey(id)){
            hashMap.remove(id);
        }
        throw new KeyAlreadyExistsException("There is no obj with such id");
    }
}
