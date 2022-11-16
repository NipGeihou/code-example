package cn.nipx.example.pojo.query;

import lombok.Data;

/**
 * 学生信息查询对象
 *
 * @author NipGeihou
 */
@Data
public class StudentQuery {

    /**
     * 学生学号
     */
    private String code;

    /**
     * 学生姓名（模糊查询）
     */
    private String name;

}