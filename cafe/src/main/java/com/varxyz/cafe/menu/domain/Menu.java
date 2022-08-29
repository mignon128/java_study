package com.varxyz.cafe.menu.domain;

import org.springframework.web.multipart.MultipartFile;

import com.varxyz.cafe.category.domain.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Menu {
	private long mid;
	private long cid;
	private Category category;
	private String name;
	private double price;
	private String size;
	private double kcal;
	private int count;
	private MultipartFile imgFile;
	private String imgName;
	
}

