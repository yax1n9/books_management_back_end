package com.zyl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
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
    @TableField(select = false)
    private String password;
    private String name;
    private int gender;

    @TableField("department_id")
    private int departmentId;
    @TableField(exist = false)
    private String department;

    @TableField("position_id")
    private int positionId;
    @TableField(exist = false)
    private String position;

    @TableField("professional_title_id")
    private int professionalTitleId;
    @TableField(exist = false)
    private String professionalTitle;


    @TableField("education_id")
    private int educationId;
    @TableField(exist = false)
    private String education;

    @TableField("major_id")
    private int majorId;
    @TableField(exist = false)
    private String major;

    private String phone;
    @TableField("issuance_date")
    private Date issuanceDate;
    @TableField("documentary_number")
    private String documentaryNumber;
    @TableField("reader_type")
    private int readerType;
    @TableField("is_delete")
    @TableLogic
    private int isDelete;
}
