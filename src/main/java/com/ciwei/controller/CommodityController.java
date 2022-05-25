package com.ciwei.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ciwei.common.ApiResult;
import com.ciwei.pojo.Commodity;
import com.ciwei.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commodity")
@CrossOrigin//跨域
public class CommodityController {

    @Autowired
    CommodityServiceImpl service;

    @GetMapping
    public ApiResult<List<Commodity>> getAll(){
        return ApiResult.success(service.list());
    }

//    @PutMapping("/upd")
//    public ApiResult<Boolean> updateCommodity(Commodity commodity) {
//        return ApiResult.success(service.updateById(commodity));
//    }
}
