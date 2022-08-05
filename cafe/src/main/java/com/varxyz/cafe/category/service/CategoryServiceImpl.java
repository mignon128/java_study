package com.varxyz.cafe.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varxyz.cafe.category.dao.CategoryDao;
import com.varxyz.cafe.category.domain.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	public CategoryDao categoryDao;
	
	public void addCategory(Category category) {
		categoryDao.addCategory(category);
	}
	
	public List<Category> findAllCategory() {
		return categoryDao.findAllCategory();
	}
	
	public List<Category> findCategoryByCid(long cid) {
		return categoryDao.findCategoryByCid(cid);
		
	}

}
