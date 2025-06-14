package com.example.practice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.model.Product;

@Service
public class ProductService {

    List<Product> allProducts = new ArrayList<>(Arrays.asList(new Product(0, "Iphone", 20000),
                                            new Product(1, "Android", 10000),
                                            new Product(2, "Dabbba", 5000)));


    public List<Product> AllProducts(){
        return allProducts;
    }

    public Product productInfo(int index){

        Product filterProduct = allProducts.stream().
                                filter((prod) -> prod.getId() == index).
                                findFirst().get();
        return filterProduct;
    }

    public void AddProduct(Product p){
        allProducts.add(p);
    }
}
