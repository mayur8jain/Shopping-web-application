package com.mayur.Back_end.dao;

import java.util.List;

import com.mayur.Back_end.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
