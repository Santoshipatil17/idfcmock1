package com.jsp.jese8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.jese8.dao.EmpDao;
import com.jsp.jese8.dto.EmpDto;

@Controller
public class EmpController {
//	@Autowired
//	EmpDto e;
	EmpDto dto=new EmpDto();
	@RequestMapping("/signup")
	public ModelAndView signup(){
		ModelAndView modelAndView=new ModelAndView("signup.jsp");
		modelAndView.addObject("empobject",dto);
		return modelAndView;
	}
	
	@RequestMapping("/insert")
	public void savedata(EmpDto recobject){
		EmpDao dao=new EmpDao();
		dao.insert(recobject);
		
	}
	@RequestMapping("/delete")
		public ModelAndView delete(){
		ModelAndView modelAndView=new ModelAndView("delete.jsp");
		modelAndView.addObject("deletebyid",dto);
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/deleteemp")
	public String deleteemp(EmpDto dto){
		EmpDao dao=new EmpDao();
		EmpDto dto2=dao.findby(dto.getEmail());
		dao.deleteData(dto2);
		return "deleted";
	}
	@RequestMapping("/update")
	public ModelAndView update(){
		ModelAndView modelAndView=new ModelAndView("update.jsp");
		modelAndView.addObject("updatebyid",dto);
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/updateemp")
	public String updateemp(EmpDto dto){
		EmpDao dao=new EmpDao();
		EmpDto dto3=dao.updatefile(dto.getEmail());
		dto3.setName(dto.getName());
		
		dao.update(dto3);
		return "updated";
	}
	@RequestMapping("/fetch")
		public ModelAndView fetch(){
			ModelAndView modelAndView=new ModelAndView("fetch.jsp");
			modelAndView.addObject("fetchobject", dto);
			return modelAndView;	
		}
	@ResponseBody
	@RequestMapping("/fetchemp")
	public String fetchemp(EmpDto dto){
		EmpDao dao=new EmpDao();
		EmpDto dto4=dao.fetch(dto.getEmail());
		return dto4.toString();
			
	}	
}
