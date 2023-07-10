package in.healthhepta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.healthhepta.entity.Product;
import in.healthhepta.service.ProductService;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

     @GetMapping("healthhepta/json")
    public List<Product> getAll(){
        return productService.findAll();
    }
    @PostMapping("healthhepta/save")
    public String saveAll(){
         productService.saveInitialBatch();
         return "Data Save Succfully";
    }
}