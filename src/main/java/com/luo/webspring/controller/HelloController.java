package com.luo.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luo.webspring.entity.Learning;

@Controller
public class HelloController {

	@RequestMapping(value = "/HelloWorld")
	@ResponseBody
	public Learning helloWorld() {
		System.out.println("Hello world!");
		Learning learning = new Learning();
		learning.setName("你好");
		// "{\"name\":\"你好\"}"
		return learning;
	}

}
