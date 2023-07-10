package in.healthhepta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.healthhepta.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

	List<Order> findAllByuser_id(Long uid);

}
