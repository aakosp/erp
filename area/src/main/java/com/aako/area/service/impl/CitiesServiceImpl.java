package com.aako.area.service.impl;

import com.aako.area.domain.cities.Cities;
import com.aako.area.domain.mapper.CitiesMapper;
import com.aako.area.domain.cities.ICitiesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author loktar
 * @since 2021-12-23
 */
@Service
public class CitiesServiceImpl extends ServiceImpl<CitiesMapper, Cities> implements ICitiesService {

}
