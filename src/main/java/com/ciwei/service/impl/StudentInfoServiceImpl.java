package com.ciwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ciwei.mapper.StudentInfoMapper;
import com.ciwei.pojo.StudentInfo;
import org.springframework.stereotype.Service;

@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements com.ciwei.service.StudentInfoService {
}

