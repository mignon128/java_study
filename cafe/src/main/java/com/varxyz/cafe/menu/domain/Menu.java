package com.varxyz.cafe.menu.domain;

import java.util.Date;

import com.varxyz.cafe.category.domain.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Menu {
	private long mid;
	private Category category;
	private String name;
	private double price;
	private double size;
	private double kcal;
	
	public Menu() {
		
	}
}
