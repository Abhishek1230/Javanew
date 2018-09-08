package com.dao.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper 
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Customer cust = new Customer();
		cust.setCustId(rs.getInt("CUST_ID"));
		cust.setName(rs.getString("NAME"));
		cust.setAge(rs.getInt("AGE"));
		return cust;
	}
	public Customer findByCustomerId(int custId){
		 
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
	 
		Customer customer = (Customer)getJdbcTemplate().queryForObject(
				sql, new Object[] { custId }, new CustomerRowMapper());
			
		return customer;
	}
}
