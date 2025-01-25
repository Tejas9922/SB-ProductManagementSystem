package com.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.entity.Product;
import com.pro.service.ProductService;

@RestController
public class Controller {

	
	@Autowired
	ProductService ps;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		return ps.addProduct(product);
	}
	
	@PostMapping("/addmultipro")
	public String addProduct(@RequestBody List<Product> product) {
		return ps.addProduct(product);
	}
	
	@GetMapping("/get")
	public List<Product> getAllProducts(){
		return ps.getAllProducts();
	}
	
	@GetMapping("/getcat/{cat}")
	public List<Product> getProductByCategory(@PathVariable("cat") String cat) {
		return ps.getProductByCategory(cat);
	}
	
	@GetMapping("/getcat2/{cat}")
	public List<Product> getProductByCategory2(@PathVariable("cat") String cat) {
		return ps.getProductByCategory2(cat);
	}
	
	@GetMapping("/asc")
	public List<Product> getPByAsc(){
		return ps.getPByAsc();
	}
	@GetMapping("/desc")
	public List<Product> getPBydesc(){
		return ps.getPBydesc();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Product product) {
		return ps.update(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		return ps.delete(id);
	}
		
	}

