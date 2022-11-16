package cn.nipx.example.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生信息实体类
 *
 * @author NipGeihou
 */
@TableName(value = "student")
@Data
public class Student {

    @TableId
    private Long id;

    private String code;

    @TableField(condition = SqlCondition.LIKE)
    private String name;

    private String remark;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

    @TableLogic
    private Integer isDeleted;

}