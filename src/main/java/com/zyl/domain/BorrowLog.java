package com.zyl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author yx
 * @date 2023/2/21
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("borrow_log")
public class BorrowLog {
    @TableId
    private Integer borrowId;
    @TableField("user_id")
    private Integer userId;
    @TableField("user_name")
    private String userName;
    @TableField("borrow_date")
    private Timestamp borrowDate;
    @TableField("reversion_date")
    private Timestamp reversionDate;
    private Integer status;
    @TableLogic
    @TableField("is_delete")
    private Integer isDelete;
}
