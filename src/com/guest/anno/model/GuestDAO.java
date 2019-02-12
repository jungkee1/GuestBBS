package com.guest.anno.model;

import java.util.List;

public interface GuestDAO {
	//interface로 만들어놓은거임(Implements에 구성할것들을 정하는 곳)
	
	
		//전체보기
		//상세보기
		//추가
		//수정
		//삭제
	
	public void insert(GuestDTO dto); //추가하기
	public List<GuestDTO> list();	//전체보기
	public void delete(int num);	//삭제하기
	public GuestDTO detail(int num); 		//상세보기
	public void update(GuestDTO dto); //수정하기
}
