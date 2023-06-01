package com.ruoyi.pill.service;

import com.ruoyi.pill.domain.PillFactory;

import java.util.List;

/**
 * @ClassName IPillFactoryService
 * @Description
 * @Author qinnan fan
 * @Date 2023/6/1 11:05
 */
public interface IPillFactoryService {
    public List<PillFactory> selectPillFactoryList(PillFactory factory);
}
