package com.aako.area.controller;


import com.aako.area.domain.areas.IAreasService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author loktar
 * @since 2021-12-23
 */
@RestController
@RequestMapping("/areas")
@Api(tags = "县级（区县）数据接口")
public class AreasController {

    @Autowired
    private IAreasService areasService;

}
