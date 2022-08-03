package com.varxyz.cafe.menu.domain;

import org.springframework.web.multipart.MultipartFile;

import com.varxyz.cafe.category.domain.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MenuCommand {
	private String category;
	private String name;
	private double price;
	private double size;
	private double kcal;
	private MultipartFile imgFile;
	private String imgName;
	
	public MenuCommand() {
		
	}
}
