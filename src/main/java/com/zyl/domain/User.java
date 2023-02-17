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
 * @date 2023/2/16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_user")
public class User {
    @TableId
    private Integer userId;
    private int role;
    private String account;
    private String password;
    private String name;
    private int gender;
    private int department;
    private int position;
    @TableField("professional_title")
    private int professionalTitle;
    private int education;
    private int major;
    private String phone;
    @TableField("issuance_date")
    private Timestamp issuanceDate;
    @TableField("documentary_number")
    private String documentaryNumber;
    @TableField("reader_type")
    private String readerType;
    @TableField("is_delete")
    @TableLogic
    private int isDelete;
}
