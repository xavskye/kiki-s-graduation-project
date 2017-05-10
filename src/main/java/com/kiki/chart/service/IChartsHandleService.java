package com.kiki.chart.service;

import com.kiki.chart.model.Charts;

/**
 * 图表统一处理服务接口
 *
 * @author kiki
 * @since 1.0
 */
public interface IChartsHandleService {

	Charts getChartByTitle(String title);

	int createNewChart(Charts chart);

	int updateChartByTitle(Charts chart);

	int deleteChartByTitle(String title);

}
