package com.ciwei.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "student")
public class StudentInfo {

    @TableId
    private Integer sid;
    private String sname;
    private String subject;
    private int  score;
}
