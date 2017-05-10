package com.kiki.chart.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 定义图标数据实体
 * nameList对应表头，nameList中每个元素代表一个列的列名和颜色
 * valueList对应表中数据，valueList中每个元素代表一行数据，包含行名称和每列对应数据
 *
 * @author kiki
 * @since 1.0
 */
public class ChartData implements Serializable {

	private List<Column> nameList;
	private List<Row> valueList;

	public List<Column> getNameList() {
		return nameList;
	}

	public void setNameList(List<Column> nameList) {
		this.nameList = nameList;
	}

	public List<Row> getValueList() {
		return valueList;
	}

	public void setValueList(List<Row> valueList) {
		this.valueList = valueList;
	}
}
