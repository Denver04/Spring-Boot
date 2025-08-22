package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.model.Product;
import com.example.practice.service.ProductService;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.AllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.productInfo(id);
    }

    /**
     * Handles HTTP POST requests to add a new product.
     * 
     * @param prod the Product object received in the request body to be added
     */
    @PostMapping("/addProduct")
    public void pushProduct(@RequestBody Product prod){
        productService.AddProduct(prod);
    }

    /**
     * Handles HTTP POST requests to update an existing product.
     * 
     * @param prod the Product object received in the request body to be updated
     */

    // @PostMapping("/updateProduct")
    // public void updateProduct(@RequestBody Product prod){
    //     productService.UpdateProduct(prod);
    // }
}
