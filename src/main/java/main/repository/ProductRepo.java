package main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import main.model.Product;

public interface ProductRepo extends MongoRepository<Product, String>{
	
}
