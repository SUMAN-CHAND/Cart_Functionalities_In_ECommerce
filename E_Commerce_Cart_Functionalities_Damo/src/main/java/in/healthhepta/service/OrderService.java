package in.healthhepta.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.healthhepta.entity.Order;
import in.healthhepta.entity.Product;
import in.healthhepta.entity.ShoppingCart;
import in.healthhepta.repository.OrderRepository;
import in.healthhepta.repository.ProductRepository;
import in.healthhepta.repository.ShoppingCartRepository;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public String saveProducts(Long uid) {
			
			
			List<ShoppingCart> shoppingCarts = shoppingCartRepository.findByuser_id(uid);
			shoppingCarts.stream().forEach(e->{
				Product productbyId = productRepository.findById(e.getProduct().getId()).get();
				if(e.getStock() <= productbyId.getQuantity() ) {
				Order order = new Order();
				order.setProduct(e.getProduct());
				order.setUser(e.getUser());
				order.setStock(e.getStock());
				order.setAmount(e.getAmount());
				order.setDate(new Date());
				order.setStatus("PURCHASED");
				orderRepository.save(order);
				shoppingCartRepository.delete(e);
					
				}});
			
			
		return "Order Placed";
	}

	public List<Order> getAllProducts(Long uid) {
		List<Order> orders = orderRepository.findAllByuser_id(uid);
		return orders;
	}

}
