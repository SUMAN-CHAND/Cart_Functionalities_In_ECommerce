package in.healthhepta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.healthhepta.entity.ShoppingCart;
import in.healthhepta.service.OrderService;
import in.healthhepta.service.ShoppingCartService;


@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private ShoppingCartService shoppingCartService;
    

   
    @GetMapping("healthhepta/json")
    public List<ShoppingCart> getAll(){
        return shoppingCartService.findByPurchased();
        }


}