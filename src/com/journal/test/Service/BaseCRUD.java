package com.journal.test.Service;

import com.journal.test.module.IHaveID;

public abstract class BaseCRUD implements IServiceCRUD, IExist{
    protected ServiceMap serviceMap;

    public BaseCRUD(){
        serviceMap = new ServiceMap();
    }

    protected IHaveID get(int id){
        return serviceMap.get(id);
    }

    @Override
    public boolean isExist(int id) {
        return get(id) != null;
    }
}
