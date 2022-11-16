package cn.nipx.example.pojo.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 学生信息请求类
 *
 * @author NipGeihou
 */
@Data
public class StudentReq {

    private Long id;

    @NotBlank(message = "学生学号不能为空")
    private String code;

    @NotBlank(message = "学生姓名不能为空")
    private String name;

    private String remark;

}