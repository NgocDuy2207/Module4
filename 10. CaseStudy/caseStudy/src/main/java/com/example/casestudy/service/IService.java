package com.example.casestudy.service;

import java.util.List;

public interface IService<T> {
    public List<T> getAll();
    void save(T t);
    void delete(int id);
}
