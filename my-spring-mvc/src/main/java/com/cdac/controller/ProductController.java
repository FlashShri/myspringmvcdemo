package com.cdac.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.entity.Product;
import com.cdac.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/sreach-product")
	public String search(@RequestParam int id , Map  model) {
		System.out.println("inside product controller");
		 Product p = productRepository.findById(id ).get();
//	Optional<Product> p = productRepository.findById(id ).get();
		 System.out.println(p.getName());
		 model.put("product", p);
		return "viewProduct.jsp";
		
	}
	
//	@RequestMapping("/add-product")
//	public String add(
//						@RequestParam String name,
//						@RequestParam double price,
//						@RequestParam int quantity,
//			 Map model ) {
//		 
//		Product p = new Product();
//		p.setName(name);
//		p.setPrice(price);
//		p.setQuantity(quantity);
//		
//		productRepository.save(p);
//		
//		model.put("msg", "Record added");
//		
//		return "addProduct.jsp" ;
//	}
	
	
	@RequestMapping("/add-product-v2")
	public String add2( Product p,  Map model ) {
		productRepository.save(p);
		model.put("msg", "Record added");
		return "addProduct.jsp" ;
	}
		
	
	@RequestMapping("/fetch-all-products")
	public String fetchall(Map model ) {
		
		List<Product> list = productRepository.findAll();
		model.put("list", list);
		return "viewAllProducts.jsp";
	}
}
