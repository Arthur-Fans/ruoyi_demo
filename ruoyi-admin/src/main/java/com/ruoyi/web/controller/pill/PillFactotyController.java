package com.ruoyi.web.controller.pill;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.pill.domain.PillFactory;
import com.ruoyi.pill.service.IPillFactoryService;
import com.ruoyi.system.domain.SysPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName PillFactotyController
 * @Description
 * @Author qinnan fan
 * @Date 2023/6/1 16:04
 */
@RestController
@RequestMapping("/pill/factory")
public class PillFactotyController extends BaseController {

    @Autowired
    private IPillFactoryService iPillFactoryService;

    /**
     * 获取生产厂家列表
     */
    @PreAuthorize("@ss.hasPermi('pill:factory:list')")
    @GetMapping("/list")
    public TableDataInfo list(PillFactory factory)
    {
        startPage();
        List<PillFactory> list = iPillFactoryService.selectPillFactoryList(factory);
        return getDataTable(list);
    }
}
