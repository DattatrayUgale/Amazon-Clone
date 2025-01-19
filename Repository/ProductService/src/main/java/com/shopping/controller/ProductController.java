package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Product;
import com.shopping.serviceI.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService proService;
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveData(@RequestBody Product product) {

//Postmapping API Created
		
		Product pro = proService.saveDetails(product); 
	    return new ResponseEntity<>(pro, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllProduct")
	public ResponseEntity<List<Product>> getData(){
		List<Product> list=proService.getallDetails();
		
		return new ResponseEntity<List<Product>>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getSingleData/{id}")
	public ResponseEntity<Product> getSingleData(@PathVariable("id") String pro_id) {
		Product pro = proService.getsingleData(pro_id);
		return new ResponseEntity<Product>(pro, HttpStatus.OK);

	}
}
