package com.varxyz.cafe.menu.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.varxyz.cafe.menu.domain.Menu;

@Component("menuDao")
public class MenuDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public MenuDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void addMenu(Menu menu) {
		String sql = "INSERT INTO Menu (cid, menuname, menuPrice, menuSize, menuKcal, menuCount, imgName) VALUES (?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, menu.getCid(), menu.getName(), menu.getPrice(), menu.getSize(), menu.getKcal(), menu.getCount(), menu.getImgName());
	}

	public List<Menu> findAllMenu() {
		String sql = "SELECT mid, menuname, menuPrice, menuSize, menuKcal, menuCount, imgName, regDate FROM Menu";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Menu>(Menu.class));
	}

	public Menu findMenuBycid(long cid) {
		String sql = "SELECT m.mid, m.menuname, m.menuPrice, m.menuSize, m.menuKcal, m.menuCount, m.regDate FROM Menu m INNER JOIN Category c ON m.menuname = c.cid WHERE c.cid=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Menu>(Menu.class), cid);
	}
}