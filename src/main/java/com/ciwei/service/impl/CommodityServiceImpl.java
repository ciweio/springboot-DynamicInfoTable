package com.ciwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ciwei.mapper.CommodityMapper;
import com.ciwei.pojo.Commodity;
import com.ciwei.service.CommodityService;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {
}
