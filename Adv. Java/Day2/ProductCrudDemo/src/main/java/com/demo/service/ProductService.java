package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addproduct(Product p);

	List<Product> getAllProducts();

	Product getById(int pid);

	boolean updateProduct(Product p);

	boolean deleteById(int pid);

}
