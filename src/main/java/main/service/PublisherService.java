package main.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import main.model.Product;

@Service
public class PublisherService {
	   private static final Logger logger = LoggerFactory.getLogger(PublisherService.class);
	   private static final String TOPIC = "products-topic";
	   	   
	   @Autowired
	   private KafkaTemplate<String,Product> kafkaTemplate;
	public void sendMessage(Product product){
	    logger.info(String.format("$$ -> Producing message --> %s",product.getName()," is sent."));
	    this.kafkaTemplate.send(TOPIC,product);
	  }
	}
