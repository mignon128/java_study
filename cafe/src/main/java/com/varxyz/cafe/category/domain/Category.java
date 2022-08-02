package com.varxyz.cafe.category.domain;

import com.varxyz.cafe.menu.domain.Menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Category {
	private long cid;
	private String name;
	private Menu menu;
	
	public Category() {
		
	}
}
