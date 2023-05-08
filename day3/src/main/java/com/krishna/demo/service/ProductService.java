package com.krishna.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.krishna.demo.model.Product;

@Service
public class ProductService {

	public List<Product> getProducts() {
		List<Product> productList = new ArrayList<>();
		Product mobile = new Product();
		mobile.setId(101);
		mobile.setName("iphone");
		mobile.setPrice(150000);
		Product laptop = new Product();
		laptop.setId(102);
		laptop.setName("DELL");
		laptop.setPrice(900000);
		productList.add(mobile);
		productList.add(laptop);
		return productList;
	}

}
