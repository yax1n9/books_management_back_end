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
 * @date 2023/2/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_type")
public class Type {
    @TableId
    private Integer typeId;
    private String name;
    @TableField("is_delete")
    @TableLogic
    private int isDelete;
}
