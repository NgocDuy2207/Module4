package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products = new HashMap<Integer, Product>();
    static {
        products.put(1, new Product(1,"SS01","galaxy", 999,"SamSung"));
        products.put(2, new Product(2,"IP02","Iphone12", 899,"Iphone"));
        products.put(3, new Product(3,"NK03","galaxy", 779,"Nokia"));
        products.put(4, new Product(4,"NK04","galaxy_14", 111,"Nokia"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
