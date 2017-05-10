package com.kiki.chart.controller;

import com.kiki.chart.common.ChartTypeEnum;
import com.kiki.chart.common.CommonErrorDefine;
import com.kiki.chart.common.OneChartResponse;
import com.kiki.chart.common.RESTfulResponse;
import com.kiki.chart.model.Charts;
import com.kiki.chart.service.IChartsHandleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 图表操作控制器
 * 提供对图表的增删改查操作
 *
 * @author kiki
 * @since 1.0
 */
@Controller
public class ChartController {
	private Log log = LogFactory.getLog(ChartController.class);

	@Autowired
	private IChartsHandleService service;

	@RequestMapping(value = "/kiki/charts/{type}", method = RequestMethod.GET)
	@ResponseBody
	public RESTfulResponse queryChart(@PathVariable String type, @RequestParam String title) {
		assert type != null;
		assert title != null;

		if (ChartTypeEnum.contains(type))
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.INVALID_TYPE, "type of chart: " + type + " is invalid!");

		if ("".equals(title))
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.INVALID_PARAM, "title can not be empty!");

		Charts chart = service.getChartByTitle(title);

		if (chart == null)
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.NOT_EXISTS, "can not find the chart of title: " + title);

		OneChartResponse response = new OneChartResponse();
		response.setFunctionResult(CommonErrorDefine.SUCCESS);
		response.setChart(chart);

		return response;
	}

	@RequestMapping(value = "/kiki/charts/{type}", method = RequestMethod.POST)
	@ResponseBody
	public RESTfulResponse createChart(@PathVariable String type, @RequestBody Charts charts) {
		assert type != null;
		assert charts != null;

		if (ChartTypeEnum.contains(type))
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.INVALID_TYPE, "type of chart: " + type + " is invalid!");

		charts.setType(type);

		int result = service.createNewChart(charts);

		if (result < 0)
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.FATAL_FAIL, "fail to create chart!");

		return RESTfulResponse.successResponse();
	}

	@RequestMapping(value = "/kiki/charts/{type}", method = RequestMethod.PUT)
	@ResponseBody
	public RESTfulResponse updateChart(@PathVariable String type, @RequestBody Charts charts) {
		assert type != null;
		assert charts != null;

		if (ChartTypeEnum.contains(type))
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.INVALID_TYPE, "type of chart: " + type + " is invalid!");

		charts.setType(type);

		int result = service.updateChartByTitle(charts);

		if (result < 0)
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.FATAL_FAIL, "fail to update chart!");

		return RESTfulResponse.successResponse();
	}

	@RequestMapping(value = "/kiki/charts/{type}", method = RequestMethod.DELETE)
	@ResponseBody
	public RESTfulResponse daleteChart(@PathVariable String type, @RequestParam String title) {
		assert type != null;
		assert title != null;

		if (ChartTypeEnum.contains(type))
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.INVALID_TYPE, "type of chart: " + type + " is invalid!");

		if ("".equals(title))
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.INVALID_PARAM, "title can not be empty!");

		int result = service.deleteChartByTitle(title);

		if (result < 0)
			return RESTfulResponse.failedResponse(
					CommonErrorDefine.FATAL_FAIL, "fail to delete chart!");

		return RESTfulResponse.successResponse();
	}
}
