package cn.nipx.example.pojo.entity;

import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
public class Student implements Serializable {

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

    private Integer isDeleted;

}