package com.zyl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yx
 * @date 2023/2/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_education")
public class Education {

    @TableId
    private Integer educationId;
    private String name;
    @TableLogic
    @TableField("is_delete")
    private int isDelete;

}
