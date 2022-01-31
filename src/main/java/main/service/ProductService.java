package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Product;
import main.repository.ProductRepo;


@Service
public class ProductService {
	
	@Autowired
    private ProductRepo productRepo;
	
	public Product save(Product product) {
        return this.productRepo.save(product);
    }
	
	public List<Product> find() {
        return this.productRepo.findAll();
    }
	
	public void deleteAll() {
		this.productRepo.deleteAll();
	}

}
