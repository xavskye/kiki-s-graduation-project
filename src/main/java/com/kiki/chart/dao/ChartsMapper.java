package com.kiki.chart.dao;

import com.kiki.chart.model.Charts;

public interface ChartsMapper {
    int deleteByPrimaryKey(String title);

    int insert(Charts record);

    int insertSelective(Charts record);

    Charts selectByPrimaryKey(String title);

    int updateByPrimaryKeySelective(Charts record);

    int updateByPrimaryKey(Charts record);
}