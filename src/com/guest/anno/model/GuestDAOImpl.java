package com.guest.anno.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class GuestDAOImpl implements GuestDAO{
	@Autowired
	private JdbcTemplate template; 

	
	//�߰��ϱ�
	@Override
	public void insert(GuestDTO dto) {
		// TODO Auto-generated method stub
		String sql = "insert into guestbook values(guestbook_seq.nextval,?,?,?,sysdate,?)";
		Object[] param = new Object[] {
				dto.getName(), dto.getContent(),dto.getGrade(),dto.getIpaddr()
		};
		template.update(sql,param);	
	}
	//��ü����
	@Override
	public List<GuestDTO> list() {
		// TODO Auto-generated method stub
		String sql = "select * from guestbook order by num ";
		List<GuestDTO> list = template.query(sql, new GuestMapper()); //rs�� mapper����
		return list;
	}
	
	//�����ϱ�
	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql = "delete from guestbook where num = ?";
		template.update(sql,num);
		
	}
	
	//�󼼺���
	@Override
	public GuestDTO detail(int num) {
		// TODO Auto-generated method stub
		String sql = "select * from guestbook where num = ? ";
		GuestDTO dto = template.queryForObject(sql, new Object[] {num}, new GuestMapper());
		return dto;
	}
	
	//�����ϱ�
	@Override
	public void update(GuestDTO dto) {
		// TODO Auto-generated method stub
		String sql = "update guestbook set name=?, content=?, grade=? where num = ?";
		Object[] param = new Object[] {
				dto.getName(), dto.getContent(), dto.getGrade(), dto.getNum()
		};
		template.update(sql,param);
	}
	
	

}
