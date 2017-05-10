package com.kiki.chart.common;

/**
 * 定义图表类型枚举
 *
 * @author kiki
 * @since 1.0
 */
public enum ChartTypeEnum {
	BAR_CHART("barChart"), PIE_CHART("pieChart"), AREA_CHART("areaChart"), WORLD_CHART("worldChart");

	private String type;

	ChartTypeEnum(String type) {
		this.type = type;
	}

	public static boolean contains(String type) {
		for (ChartTypeEnum typeEnum : ChartTypeEnum.values()) {
			if (typeEnum.name().equals(type))
				return true;
		}
		return false;
	}

}
