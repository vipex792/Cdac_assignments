package com.demo.CategoryRestWebServic.service;

import com.demo.CategoryRestWebServic.beans.Category;
import com.demo.CategoryRestWebServic.dto.CategoryDto;

public interface CategoryService {

	Category getById(int cid);

	CategoryDto getProdCatById(int cid);

}
