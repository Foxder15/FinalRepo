package com.code.service;

import com.code.model.Product;
import com.code.model.User;
import com.code.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository){
		this.productRepository = productRepository;
	}

	public List<Product> getProduct(){
		return (List<Product>) productRepository.findAll();
	}

	public List<Product> searchProduct(String keyword){
		return productRepository.searchProduct(keyword);
	}

	public void addProduct(Product product){
		productRepository.save(product);
	}
	public void updateProduct(int id, Product productRequest){
		Product product = productRepository.findById(id).get();
		product.setProductName(productRequest.getProductName());
		product.setProductCode(productRequest.getProductCode());
		product.setImportQuality(productRequest.getImportQuality());
		product.setSoldQuality(productRequest.getSoldQuality());
		product.setInStockQuality(productRequest.getInStockQuality());
		product.setImportPrice(productRequest.getImportPrice());
		product.setRetailPrice(productRequest.getRetailPrice());
		product.setStatus(productRequest.getStatus());
		product.setExpiry(productRequest.getExpiry());
		productRepository.save(product);
	}

	public Product findProductById(int id){
		return productRepository.findById(id).get();
	}
}
