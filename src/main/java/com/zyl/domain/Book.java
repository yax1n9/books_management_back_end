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
 * @date 2023/2/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_book")
public class Book {
    @TableId
    private int bookId;
    private String name;
    private String author;
    private Integer edition;
    private double price;
    @TableField("publishing_house")
    private String publishingHouse;
    private Integer type;
    @TableField("publish_time")
    private Date publishTime;
    private Integer status;
    @TableLogic
    @TableField("is_delete")
    private int isDelete;
}
