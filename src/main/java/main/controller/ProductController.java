package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.model.Product;
import main.service.ProductService;
import main.service.PublisherService;

@RequestMapping("/products")
@RestController
public class ProductController {
	
	private final PublisherService producerService;
	
	@Autowired
	public ProductController(PublisherService producerService) {
	this.producerService = producerService;
	  }
	
	@Autowired
    private ProductService productService;
	
	@PostMapping(value = "")
    public Product save(@RequestBody Product product) {
		this.producerService.sendMessage(product);
        return this.productService.save(product);
    }
	
	@GetMapping(value = "")
    public Iterable<Product> findAll() {
        return this.productService.find();
    }
	
	@DeleteMapping(value="")
	public void deleteAll() {
		this.productService.deleteAll();
	}
	
}
