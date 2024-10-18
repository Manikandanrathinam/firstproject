package com.product.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.Entity.Product;
import com.product.Repository.ProductRepository;
@Repository
public class ProductDAO {
@Autowired
ProductRepository pr;
	public String postObj(List<Product> p) {
		 pr.saveAll(p);
		 return "Successfully";
	}
	public List<Product> findObj() {
		return pr.findAll();
	}
	public Optional<Product> getByI(int a) {
		return pr.findById(a);
	}

}
