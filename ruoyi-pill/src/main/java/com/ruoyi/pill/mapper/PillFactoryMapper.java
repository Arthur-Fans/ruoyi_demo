package com.ruoyi.pill.mapper;

import com.ruoyi.pill.domain.PillFactory;

import java.util.List;

/**
 * @ClassName PillFactoryMapper
 * @Description
 * @Author qinnan fan
 * @Date 2023/6/1 11:01
 */
public interface PillFactoryMapper {
    public List<PillFactory> selectPillFactoryList(PillFactory factory);
}
