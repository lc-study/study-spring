package com.lc.spring.mvc.controller;


import com.lc.spring.mvc.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class HelloController {
	@Resource
	private HelloService helloService;

	@RequestMapping("/hello")
	public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello.html");
        String hello = helloService.hello();
        mv.addObject("content", hello);
        System.out.println("HelloController：" + hello);
        return mv;
	}
}
