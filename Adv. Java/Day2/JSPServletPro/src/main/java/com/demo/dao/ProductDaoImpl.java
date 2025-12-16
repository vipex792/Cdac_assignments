package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static PreparedStatement selproduct, insproduct, selById, updateById, deleteById;
	static {
		conn = DBUtil.getMyConnection();
		try {
			selproduct = conn.prepareStatement("select * from product1");
			insproduct = conn.prepareStatement("insert into from product1 values(?,?,?,?,?,?)");
			selById = conn.prepareStatement("select * form product1 where pid=?");
			updateById = conn
					.prepareStatement("update product1 set pname=?,qty=?,price=?,expdate=?,cid=?, where pid=?");
			deleteById = conn.prepareStatement("delete product1 from where pid =?");
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = selproduct.executeQuery();
			while (rs.next()) {
				plist.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
						rs.getDate(5).toLocalDate(), rs.getInt(6)));

			}

			return plist;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean save(Product p) {
		try {
			insproduct.setInt(1, p.getPid());
			insproduct.setString(2, p.getPname());
			insproduct.setInt(3, p.getQty());
			insproduct.setDouble(4, p.getPrice());
			insproduct.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
			insproduct.setInt(6, p.getCid());
			int n = insproduct.executeUpdate();
			return n > 0;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Product findById(int pid) {
		try {
			selById.setInt(1, pid);
			ResultSet rs = selById.executeQuery();

			if (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
						rs.getDate(5).toLocalDate(), rs.getInt(6));
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	
	
	@Override
	public boolean modifyproduct(Product p) {
		try {
			updateById.setInt(1, p.getPid());
			updateById.setString(2,p.getPname());
			updateById.setInt(3, p.getQty());
			updateById.setDouble(4, p.getPrice());
			updateById.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
			updateById.setInt(6, p.getCid());
			int n = updateById.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeById(int pid) {
		try {
			deleteById.setInt(1, pid);
			int n = deleteById.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
