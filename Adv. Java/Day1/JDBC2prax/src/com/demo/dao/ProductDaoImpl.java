package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
static Connection conn;
static PreparedStatement insProd;


	static {
		
		try {
		conn=DBUtil.getMyConnection();
		insProd=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
		}
		
		
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

//error
	@Override
	public boolean save(Product p) {
		try {
			insProd.setInt(1,p.getPid());
			insProd.setString(2,p.getPname());
			insProd.setInt(3, p.getQty());
			insProd.setDouble(4, p.getPrice());
			insProd.setDate(5,java.sql.Date.valueOf(p.getLdt()));
			
			int n = insProd.executeUpdate();
			return n>0;
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public List<Product> findAllProducts() {
		
		return null;
	}


	@Override
	public Product findById(int id) {
		
		return null;
	}


	@Override
	public boolean updateById(int id, int qty, double price) {
		return false;
	}


	@Override
	public boolean removeById(int id) {
		return false;
	}


	@Override
	public List<Product> arrangeByPrice() {
		return null;
	}


	@Override
	public void closeConnection() {
		
	}



}
