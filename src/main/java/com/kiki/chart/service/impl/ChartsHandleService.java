package com.kiki.chart.service.impl;

import com.kiki.chart.dao.ChartsMapper;
import com.kiki.chart.model.Charts;
import com.kiki.chart.service.IChartsHandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 图表统一处理服务接口实现类
 *
 * @author kiki
 * @since 1.0
 */
@Service
public class ChartsHandleService implements IChartsHandleService {

	@Autowired
	private ChartsMapper mapper;

	public Charts getChartByTitle(String title) {
		return mapper.selectByPrimaryKey(title);
	}

	public int createNewChart(Charts chart) {
		return mapper.insertSelective(chart);
	}

	public int updateChartByTitle(Charts chart) {
		return mapper.updateByPrimaryKeySelective(chart);
	}

	public int deleteChartByTitle(String title) {
		return mapper.deleteByPrimaryKey(title);
	}
}
