package com.varxyz.cafe.category.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.varxyz.cafe.category.domain.Category;
import com.varxyz.cafe.menu.domain.Menu;

@Component("categorytDao")
public class CategoryDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public CategoryDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCategory(Category category) {
		String sql = "INSERT INTO Menu (cname) VALUES (?)";
		jdbcTemplate.update(sql, category.getName());
	}

//	public List<Menu> findAllMenu() {
//		String sql = "SELECT mid, menuname, menuPrice, menuSize, menuKcal regDate FROM Menu";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Menu>(Menu.class));
//	}
//
//	public List<Menu> findMenuByctype(String ctype) {
//		String sql = "SELECT m.mid, m.menuname, m.menuPrice, m.menuSize, m.menuKcal, m.regDate FROM Menu m INNER JOIN Category c ON m.menuname = c.cid WHERE c.ctype=?";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Menu>(Menu.class), ctype);
//	}
}