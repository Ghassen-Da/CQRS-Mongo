package main.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection="products")
@Data

public class Product{
	
  @Id
  private String id;

  private String name;
  
  private double price;
  
  private String category;
  
  private String description;
  
  private String image;

public String getId() {
	// TODO Auto-generated method stub
	return this.id;
}

}
