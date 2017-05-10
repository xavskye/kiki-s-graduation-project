package com.kiki.chart.common;

import com.kiki.chart.model.Charts;

/**
 * 响应一个Chart对象
 *
 * @author kiki
 * @since 1.0
 */
public class OneChartResponse extends RESTfulResponse {

	private Charts chart;

	public Charts getChart() {
		return chart;
	}

	public void setChart(Charts chart) {
		this.chart = chart;
	}
}
