package com.krishna.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.demo.model.Product;
import com.krishna.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/products")
	public List<Product> products() {
		return service.getProducts();
	}

}
