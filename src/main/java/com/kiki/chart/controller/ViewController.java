package com.kiki.chart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端视图控制器
 *
 * @author kiki
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/kiki")
public class ViewController {

	@RequestMapping(value = "/index")
	public String index(){
		return "index";
	}

	@RequestMapping(value = "/charts/createChart")
	public String createChart(){
		return "createChart";
	}

	@RequestMapping(value = "/charts/getChart")
	public String getChart(){
		return "getChart";
	}

	@RequestMapping(value = "/charts/deleteChart")
	public String deleteChart(){
		return "deleteChart";
	}

	@RequestMapping(value = "/charts/updateChart")
	public String updateChart(){
		return "updateChart";
	}
}
