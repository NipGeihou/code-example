package cn.nipx.example.pojo.resp;

import lombok.Data;

import java.util.Date;

/**
 * 学生信息响应对象
 *
 * @author NipGeihou
 * @create 2022-08-17 22:30
 */
@Data
public class StudentResp {

    private Long id;

    private String code;

    private String name;

    private String remark;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

}