package com.kiki.chart.common.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 定义图标数据行的实体
 *
 * @author kiki
 * @since 1.0
 */
public class Row implements Serializable {

	// 行名称
	@JsonProperty("row_name")
	private String rowName;

	// 对应列的值，必须与nameList中列名的顺序一致
	private List<String> values;

	public String getRowName() {
		return rowName;
	}

	public void setRowName(String rowName) {
		this.rowName = rowName;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
}
