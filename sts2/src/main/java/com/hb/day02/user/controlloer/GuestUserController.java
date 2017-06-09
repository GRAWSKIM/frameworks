package com.hb.day02.user.controlloer;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.day02.user.model.GuestUserDao;
import com.hb.day02.user.model.GuestUserVo;

@Controller
public class GuestUserController {
	@Autowired
	private GuestUserDao<GuestUserVo> guestUserDao;
	
	@RequestMapping("/user/list")
	public void selectAll(Model model){
		try {

			model.addAttribute("alist", guestUserDao.selectAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/user/detail")
	public void selectOne(Model model,@RequestParam int idx){
		
		try {
			model.addAttribute("bean",guestUserDao.selectOne(idx));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/user/add")
	public void addForm(Model model){
		model.addAttribute("title","입력");
		model.addAttribute("nxturl","insert");	
	}
	@RequestMapping("/user/insert")
	public String insertOne(@RequestParam int num,@RequestParam int sabun, @RequestParam String name){
		
		try {
			guestUserDao.insertOne(new GuestUserVo(num, sabun, name, null));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/day02/user/list";
	}
	
	@RequestMapping(value="/user/edit",method=RequestMethod.GET)
	public String editForm(Model model,int idx){
		model.addAttribute("title","수정");
		model.addAttribute("nxturl","edit");
		try{
			model.addAttribute("bean",guestUserDao.selectOne(idx));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "/day02/user/add";
	}
	
	@RequestMapping(value="/user/edit",method=RequestMethod.POST)
	public String updateOne(@ModelAttribute GuestUserVo bean){
		int result = 0;
			try{
				result= guestUserDao.updateOne(bean);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return "/day02/user/list";
	}
	
}
