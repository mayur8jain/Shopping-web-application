package com.mayur.Back_end.dao;

import java.util.List;

import com.mayur.Back_end.dto.Category;

public interface CategoryDAO {

	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
