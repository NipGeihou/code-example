package cn.nipx.example.service;

import cn.hutool.core.bean.BeanUtil;
import cn.nipx.example.repository.StudentRepository;
import cn.nipx.example.pojo.entity.Student;
import cn.nipx.example.pojo.query.StudentQuery;
import cn.nipx.example.pojo.req.StudentReq;
import cn.nipx.example.pojo.resp.StudentResp;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 学生信息服务接口实现类
 *
 * @author NipGeihou
 */
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudentResp> list(StudentQuery query) {
        List<Student> list = studentRepository.list(query);
        return BeanUtil.copyToList(list, StudentResp.class);
    }

    public StudentResp detail(Long id) {
        Student student = studentRepository.getById(id);
        return BeanUtil.copyProperties(student, StudentResp.class);
    }

    public void save(StudentReq req) {
        Student student = BeanUtil.copyProperties(req, Student.class);
        Assert.isTrue(studentRepository.save(student), "新增失败");
    }

    public void updateById(StudentReq req) {
        Student student = BeanUtil.copyProperties(req, Student.class);
        Assert.isTrue(studentRepository.updateById(student), "更新失败");
    }

    public void deleteById(Long id) {
        Assert.isTrue(studentRepository.removeById(id), "删除失败");
    }


}




