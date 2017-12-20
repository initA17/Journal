package com.journal.test.Service;

import com.journal.test.module.IHaveID;

public interface IServiceCRUD {
    boolean create(IHaveID obj);
    Object read(IHaveID obj);
    void update(IHaveID oldObj, IHaveID newObj);
    void delete(IHaveID obj);
}
