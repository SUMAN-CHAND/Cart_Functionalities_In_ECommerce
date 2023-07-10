package in.healthhepta.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.healthhepta.entity.ShoppingCart;

import java.util.List;
@EnableJpaRepositories
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);

	List<ShoppingCart> findByuser_id(Long uid);
}