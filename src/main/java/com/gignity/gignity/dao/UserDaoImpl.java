package com.gignity.gignity.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.gignity.gignity.dao.mapper.UserRowMapper;
import com.gignity.gignity.user.User;

@Component
public class UserDaoImpl implements UserDao{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public void insertUser(String name) {
	}

	@Override
	public User getUser(int id) {
		
		String sqlQuery = "SELECT * FROM users Where id = :id";
		Map<String,Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("id",id);
		return namedParameterJdbcTemplate.query(sqlQuery, paramMap, new UserRowMapper()).get(0);
	}
	
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	

}
