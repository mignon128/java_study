package com.varxyz.cafe.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.cafe.category.dao.CategoryDao;

@Service
public class CategoryService {
	
	@Autowired
	public CategoryDao categoryDao;
	
	public CategoryService(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

}
