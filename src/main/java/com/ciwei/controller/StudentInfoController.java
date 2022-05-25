package com.ciwei.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ciwei.common.ApiResult;
import com.ciwei.pojo.StudentInfo;
import com.ciwei.service.impl.StudentInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin//跨域
public class StudentInfoController {

    @Autowired
    StudentInfoServiceImpl service;

    @GetMapping
    public ApiResult<List<StudentInfo>> getAll() {
        return ApiResult.success(service.list());
    }

    @DeleteMapping("{sid}")
    public ApiResult<Boolean> delStudent(@PathVariable Integer sid) {
        return ApiResult.success(service.removeById(sid));
    }

    @PostMapping("/add")
    public ApiResult<Boolean> addStudent(@RequestBody StudentInfo info) {
        return ApiResult.success(service.save(info));
    }

    @PutMapping("/upd")
    public ApiResult<Boolean> updateStudent(@RequestBody StudentInfo info) {
        return ApiResult.success(service.updateById(info));//service.saveOrUpdate(info)
    }

    @GetMapping("/{sname}")
    public ApiResult<StudentInfo> getOne(@PathVariable String sname) {
        QueryWrapper<StudentInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("sname", sname);
        StudentInfo studentInfo = service.getOne(wrapper);
        return studentInfo == null ? ApiResult.unfound():ApiResult.success(studentInfo);
    }
}
