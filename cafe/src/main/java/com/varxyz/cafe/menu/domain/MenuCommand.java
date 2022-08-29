package com.varxyz.cafe.menu.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuCommand {
	private String category;
	private String name;
	private String price;
	private String size;
	private String kcal;
	private String count;
	private MultipartFile imgFile;
	private String imgName;

}
