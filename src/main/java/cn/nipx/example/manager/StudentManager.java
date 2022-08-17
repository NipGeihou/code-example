package cn.nipx.example.manager;

import cn.nipx.example.mapper.StudentMapper;
import cn.nipx.example.pojo.entity.Student;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

/**
 * 学生信息通用业务处理层
 *
 * @author NipGeihou
 * @create 2022-08-17 22:34
 */
@Repository
public class StudentManager extends ServiceImpl<StudentMapper, Student> {
}
