package cn.nipx.example.pojo.req;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * 学生信息请求类
 *
 * @author NipGeihou
 */
@Data
public class StudentReq implements Serializable {

    private Long id;

    @NotNull
    private String code;

    private String name;

    private String remark;

}