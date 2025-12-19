package com.demo.CategoryRestWebServic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.CategoryRestWebServic.beans.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {

}
