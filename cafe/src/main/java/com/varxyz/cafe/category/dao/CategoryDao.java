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
		String sql = "INSERT INTO Category (cname) VALUES (?)";
		jdbcTemplate.update(sql, category.getCatename());
	}

	public List<Category> findAllCategory() {
		String sql = "SELECT cid, cname, regDate FROM Category";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));
	}
	
	public List<Category> findCategoryByCid(long cid) {
		String sql = "SELECT c.cid, c.cname,c, regDate WHERE c.cid=?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class), cid);
	}
}
