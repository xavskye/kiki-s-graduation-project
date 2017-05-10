package com.kiki.chart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kiki.chart.common.pojo.ChartData;

/**
 * 映射数据库charts表，将其映射为javaBean
 * 通过mybatis完成对数据库操作
 *
 * @author kiki
 * @since 1.0
 */
public class Charts {
    private String title;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("scale_text_color")
    private String scaleTextColor;

    @JsonProperty("value_text_color")
    private String valueTextColor;

    @JsonProperty("chart_data")
    private ChartData chartData;

    @JsonIgnore
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor == null ? null : backgroundColor.trim();
    }

    public String getScaleTextColor() {
        return scaleTextColor;
    }

    public void setScaleTextColor(String scaleTextColor) {
        this.scaleTextColor = scaleTextColor == null ? null : scaleTextColor.trim();
    }

    public String getValueTextColor() {
        return valueTextColor;
    }

    public void setValueTextColor(String valueTextColor) {
        this.valueTextColor = valueTextColor == null ? null : valueTextColor.trim();
    }

    public ChartData getChartData() {
        return chartData;
    }

    public void setChartData(ChartData chartData) {
        this.chartData = chartData;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}