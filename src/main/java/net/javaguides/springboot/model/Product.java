package net.javaguides.springboot.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
@Data
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@CreationTimestamp
	private Date createdAt;
	
	@CreationTimestamp
	private Date updatedAt;


}
