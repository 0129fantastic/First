package com.zhiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public ModelAndView method() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("msg", "今天贼暖和!!!");
		modelAndView.setViewName("show");
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/login")
	public String method1() {

		return "login";// 逻辑视图
	}
}
