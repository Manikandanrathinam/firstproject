package com.product.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.Entity.Product;
import com.product.Service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {
@Autowired
ProductService ps;
@PostMapping("/postAll")
public String postObj(@RequestBody List<Product> p) {
	return ps.postObj(p);
}
@GetMapping("/findAl")
public List<Product> findObj() {
    return ps.findObj();
}
@GetMapping("/getByI/{a}")
public Optional<Product> getByI(@PathVariable int a){
	return ps.getByI(a);
}
}
