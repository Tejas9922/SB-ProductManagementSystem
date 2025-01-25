package com.pro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.dao.ProductDAO;
import com.pro.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO pd;

	public String addProduct(Product product) {
		return pd.addProduct(product);
	}

	public String addProduct(List<Product> product) {

		return pd.addProduct(product);
	}

	public List<Product> getAllProducts() {
		return pd.getAllProducts();
	}

	public List<Product> getProductByCategory(String cat) {

		List<Product> product = new ArrayList();

		for (Product pro : pd.getAllProducts()) {
			if (pro.getCategory().equalsIgnoreCase(cat)) {
				product.add(pro);
			}
		}
		return product;
	}

	public List<Product> getProductByCategory2(String cat) {
		return pd.getProductByCategory2(cat);
	}

	public List<Product> getPByAsc() {
		return pd.getPByAsc();
	}

	public List<Product> getPBydesc() {
		return pd.getPBydesc();
	}

	public String update(Product product) {
		return pd.update(product);
	}
	
	public String delete(int id) {
		return pd.delete(id);
	}

	
}
