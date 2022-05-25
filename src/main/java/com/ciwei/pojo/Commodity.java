package com.ciwei.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "commodity")
public class Commodity {

    @TableId
    private Integer gid;
    private String commodityUrl;
    private String commodityDesc;
    private String commodityPrice;
    private Integer commodityCount;
    private Boolean ischecked;
}
