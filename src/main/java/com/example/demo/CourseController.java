package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


//process1 
@Controller
public class CourseController {
	
	
	@RequestMapping("/course")
	public ModelAndView course(@RequestParam("cname") String coursename) {
		
		ModelAndView mv= new ModelAndView();//special class 
		mv.addObject("cname", coursename);
		mv.setViewName("/course.jsp");///course is .jsp name 
		
		return mv;
		
		
	}}





/////process 2

//@Controller
//public class CourseController {
//	
//	
//	@RequestMapping("/course")
//	public String couse(HttpServletRequest req) {
//		
//		HttpSession session=req.getSession();//this will accept the object from form like name ,age,roll to session
//		//even  HttpSession session will pass the value to other pages 		
//		
//		String name=req.getParameter("cname"); //accept the value from httpheader like parameter cname= \eg,age from http header 
//		session.setAttribute("passtoanother", name);
//		
//		return "course.jsp";
//	}
//
//}





//process 3

//@Controller
//public class CourseController {
//	
//	
//	@RequestMapping("/course")
//	public String couse(@RequestParam("cname") String coursename,HttpSession session) {
//		
//		//http header name cname bata pass huncha ani cnameko value coursename ma bascha 
//		
//		session.setAttribute("passtoanother", coursename); ///http parameter consist of cname
//		
//		return "course.jsp";
//	}
//
//}

