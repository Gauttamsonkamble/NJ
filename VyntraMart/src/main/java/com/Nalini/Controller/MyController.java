package com.Nalini.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MyController {
	
	@RequestMapping("VyntraMart")
	public String home()
	{
		return "index";
	}

}
