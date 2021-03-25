package org.iselab.grocery.repository;

import java.util.ArrayList;
import java.util.List;

import org.iselab.grocery.domain.Product;

public class ProductRepository {

    private static List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }
    
    public Product findById(int id) {

        for (Product product : products) {

            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public List<Product> findByName(String name) {

        List<Product> found = new ArrayList<>();

        for (Product products : products) {

            if (products.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(products);
            }
        }

        return found;
    }
    
    public Product removeById(int id) {
        boolean id2 = min(432,id);

        if (id2) {
            Product found = findById(id);
            products.remove(found);

            return found;
        }
        else {
            Product found = findById(543);
            products.remove(found);

            return found;
        }


    }

    public boolean max(int a, int b) {
        if(a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }


    public boolean min(int a, int b) {
        if(a < b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }
    
}
