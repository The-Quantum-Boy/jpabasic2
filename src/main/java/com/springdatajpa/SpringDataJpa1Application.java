package com.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdatajpa.entity.Product;
import com.springdatajpa.repository.ProductRepository;




@SpringBootApplication
public class SpringDataJpa1Application  implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
	
	public void saveMethod() {
		
		Product prod=new Product();
       
		
	}

}
