package com.varxyz.cafe.category.domain;

import com.varxyz.cafe.menu.domain.Menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class CategoryCommand {
	private String name;
	private Menu menu;

}
