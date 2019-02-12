package com.guest.anno.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GuestMapper implements RowMapper<GuestDTO>{

	@Override
	public GuestDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		GuestDTO dto = new GuestDTO();
		dto.setNum(rs.getInt("num"));
		dto.setName(rs.getString("name"));
		dto.setContent(rs.getString("content"));
		dto.setGrade(rs.getString("grade"));
		dto.setCreated(rs.getString("created"));
		dto.setIpaddr(rs.getString("ipaddr"));
		return dto;
	}

}
