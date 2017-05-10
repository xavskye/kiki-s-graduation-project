package com.kiki.chart.common.pojo;

import java.io.Serializable;

/**
 * 定义图表数据列名的实体
 *
 * @author kiki
 * @since 1.0
 */
public class Column implements Serializable {

	// 列名称
	private String name;

	// 列颜色
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
