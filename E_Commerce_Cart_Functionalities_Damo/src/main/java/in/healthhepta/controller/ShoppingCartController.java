package in.healthhepta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.healthhepta.dto.ShoppingCartDTO;
import in.healthhepta.entity.ShoppingCart;
import in.healthhepta.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    
   @PostMapping("healthhepta/json")
   public ShoppingCart addProductItem(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        return shoppingCartService.saveProducts(shoppingCartDTO);
    }


     @GetMapping("healthhepta/json")
    public List<ShoppingCart> getAll(){
        return shoppingCartService.findAll();
    }


    @DeleteMapping("/{id}")
    public void deleteProductItem(@PathVariable("id") Long ids) {
        shoppingCartService.deleteProduct(ids);
    }

    @DeleteMapping
    public void ClearCart( Object object) {
        shoppingCartService.clearShoppingCart(object);
    }

    @PostMapping("/purchase/{id}")
    public void purchaseProducts(@PathVariable("id") Long id) {
        shoppingCartService.purchaseProducts(id);
    }
}