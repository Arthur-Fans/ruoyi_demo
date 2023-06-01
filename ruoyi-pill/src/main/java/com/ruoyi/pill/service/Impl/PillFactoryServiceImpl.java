package com.ruoyi.pill.service.Impl;

import com.ruoyi.pill.domain.PillFactory;
import com.ruoyi.pill.mapper.PillFactoryMapper;
import com.ruoyi.pill.service.IPillFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PillFactoryServiceImpl
 * @Description
 * @Author qinnan fan
 * @Date 2023/6/1 11:06
 */

@Service
public class PillFactoryServiceImpl implements IPillFactoryService {
    @Autowired
    private PillFactoryMapper pillFactoryMapper;

    @Override
    public List<PillFactory> selectPillFactoryList(PillFactory factory) {
        return pillFactoryMapper.selectPillFactoryList(factory);
    }
}
