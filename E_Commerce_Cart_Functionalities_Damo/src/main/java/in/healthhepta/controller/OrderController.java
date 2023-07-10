package in.healthhepta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.healthhepta.entity.Order;
import in.healthhepta.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("healthhepta/json/{uid}")
	   public String orderItem(@PathVariable Long uid) {
	        return orderService.saveProducts(uid);
	    }
	@GetMapping("healthhepta/json/{uid}")
	   public List<Order> orderedItem(@PathVariable Long uid) {
	        return orderService.getAllProducts(uid);
	    }
	
	
}
