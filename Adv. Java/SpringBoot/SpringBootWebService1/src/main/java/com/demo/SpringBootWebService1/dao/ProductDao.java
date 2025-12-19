package com.demo.SpringBootWebService1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootWebService1.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
	
	@Query(value="select * from product42 where price between :lprice and :highprice",nativeQuery=true)
	List<Product> findByPrice(double lprice,double hprice);
	
	@Procedure(procedureName="getCount")
	public int getCount();

}
