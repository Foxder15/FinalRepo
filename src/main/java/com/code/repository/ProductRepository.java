package com.code.repository;

import com.code.model.Product;
import com.code.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	@Query("SELECT p FROM Product p where p.productName LIKE %?1% or p.productCode LIKE %?1% or p.status LIKE %?1%")
	List<Product> searchProduct(String keyword);
}
