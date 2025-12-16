package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAllProducts();

	Product findById(int pid);

	boolean modifyproduct(Product p);

	boolean removeById(int pid);

}
