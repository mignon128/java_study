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
public class Category {
	private long cid;
	private String catename;
	private Menu menu;
	
	public Category() {
		
	}
	
	public Category(long cid) {
		this.cid = cid;
	}
}
