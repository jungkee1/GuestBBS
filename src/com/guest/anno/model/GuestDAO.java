package com.guest.anno.model;

import java.util.List;

public interface GuestDAO {
	//interface�� ������������(Implements�� �����Ұ͵��� ���ϴ� ��)
	
	
		//��ü����
		//�󼼺���
		//�߰�
		//����
		//����
	
	public void insert(GuestDTO dto); //�߰��ϱ�
	public List<GuestDTO> list();	//��ü����
	public void delete(int num);	//�����ϱ�
	public GuestDTO detail(int num); 		//�󼼺���
	public void update(GuestDTO dto); //�����ϱ�
}
