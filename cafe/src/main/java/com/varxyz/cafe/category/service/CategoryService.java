package com.varxyz.cafe.category.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.varxyz.cafe.category.domain.Category;

@Service
public interface CategoryService {
	
	void addCategory(Category category);
	List<Category> findAllCategory();

}
