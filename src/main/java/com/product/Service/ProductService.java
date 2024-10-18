package com.product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.DAO.ProductDAO;
import com.product.Entity.Product;
@Service
public class ProductService {
@Autowired
ProductDAO pd;
	public String postObj(List<Product> p) {
		return pd.postObj(p);
	}
	public List<Product> findObj() {
		return pd.findObj();
	}
	public Optional<Product> getByI(int a) {
		return pd.getByI(a);
	}

}
