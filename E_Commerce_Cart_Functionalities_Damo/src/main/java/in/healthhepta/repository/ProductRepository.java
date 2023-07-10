package in.healthhepta.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.healthhepta.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}