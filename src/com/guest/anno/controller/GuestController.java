package com.guest.anno.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guest.anno.model.GuestDAOImpl;
import com.guest.anno.model.GuestDTO;

@Controller
public class GuestController {
	@Autowired
	private GuestDAOImpl dao;
	
	@RequestMapping("/gInsert.m") //get ��� //insert form���� �̵�
	public ModelAndView insert() {
		return new ModelAndView("guestInsert");
	}
	
	//insert
	@RequestMapping(value="/gInsert.m", method=RequestMethod.POST)
	public ModelAndView insert(GuestDTO dto, HttpServletRequest req) { //Http req��ü �޾ƿͼ� �ؿ� IP���µ� ���
		dto.setIpaddr(req.getRemoteAddr());
		dao.insert(dto);
		return new ModelAndView("redirect:gList.m");
	}
	
	//gList ��ü����
	@RequestMapping("/gList.m")
	public ModelAndView list() {
		List<GuestDTO> dto = dao.list();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", dto);
		mv.setViewName("guestList"); //jsp �̸�
		return mv;
	}
	
	//gDelete �����ϱ�
	@RequestMapping("/gDelete.m")
	public ModelAndView delete(int num) {
		dao.delete(num);
		return new ModelAndView("redirect:gList.m");
	}
	
	//gDetatil �󼼺���
	@RequestMapping("/gDetail.m")
	public ModelAndView detail(int num) {
		GuestDTO dto = dao.detail(num);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", dto);
		mv.setViewName("detail"); //detail.jsp
		return mv;
	}
	
	//gUpdate �����ϱ�
	@RequestMapping(value="/gUpdate.m", method=RequestMethod.POST)
	public ModelAndView update(GuestDTO dto) {
		dao.update(dto);
		return new ModelAndView("redirect:gList.m");
		
		
	}

}
