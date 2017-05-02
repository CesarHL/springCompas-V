package com.ipn.escom.spring;

import com.mongodb.WriteResult;
import java.util.List;

public interface Repository<T> {

    public List<T> getAllObjects();

    public void saveObject(T object);

    public T getObject(String id);

    public WriteResult updateObject(String id, String name);

    public void deleteObject(String id);

    public void createCollection();

    public void dropCollection();
}
