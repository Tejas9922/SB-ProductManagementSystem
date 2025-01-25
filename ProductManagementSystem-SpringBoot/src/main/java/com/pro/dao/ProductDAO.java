package com.pro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pro.entity.Product;

@Repository
public class ProductDAO {

	@Autowired
	SessionFactory sf;

	public String addProduct(Product product) {

		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(product);
		tx.commit();
		ss.close();

		return "Data added";
	}

	public String addProduct(List<Product> product) {

		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		for (Product products : product) {
			ss.save(products);
		}

		tx.commit();
		ss.close();

		return "Multiple Data added";
	}

	public List<Product> getAllProducts() {

		Session ss = sf.openSession();
		List<Product> product = ss.createCriteria(Product.class).list();
		return product;
	}

	public List<Product> getProductByCategory2(String cat) {
		Session ss = sf.openSession();
		List<Product> product = ss.createCriteria(Product.class).add(Restrictions.ilike("category", "%" + cat + "%"))
				.list();
		return product;
	}

	public List<Product> getPByAsc() {
		Session ss = sf.openSession();
		List<Product> product = ss.createCriteria(Product.class).addOrder(org.hibernate.criterion.Order.asc("price"))
				.list();

		return product;
	}

	public List<Product> getPBydesc() {
		Session ss = sf.openSession();
		List<Product> product = ss.createCriteria(Product.class).addOrder(org.hibernate.criterion.Order.desc("price"))
				.list();

		return product;
	}

	public String update(Product product) {

		try (Session ss = sf.openSession()) {
			Transaction tx = ss.beginTransaction();
			Product eProduct = ss.get(Product.class, product.getId());

			if (eProduct != null) {
				eProduct.setId(product.getId());
				eProduct.setName(product.getName());
				eProduct.setPrice(product.getPrice());
				eProduct.setMng(product.getMng());
				eProduct.setExp(product.getExp());
				eProduct.setCategory(product.getCategory());

			}

			ss.getTransaction().commit();
		}

		return "data updated";
	}

	public String delete(int id) {
		try (Session ss = sf.openSession()) {
			Transaction tx = ss.beginTransaction();
			Product product = ss.get(Product.class, id);
			if (product != null) {
				ss.delete(product);
			}
			ss.getTransaction().commit();
		}
		return "Data Deleted";
	}

}
