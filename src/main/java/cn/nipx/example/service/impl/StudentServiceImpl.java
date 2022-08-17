package cn.nipx.example.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.nipx.example.manager.StudentManager;
import cn.nipx.example.pojo.entity.Student;
import cn.nipx.example.pojo.query.StudentQuery;
import cn.nipx.example.pojo.req.StudentReq;
import cn.nipx.example.pojo.resp.StudentResp;
import cn.nipx.example.service.StudentService;
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
public class StudentServiceImpl implements StudentService {

    private final StudentManager studentManager;

    @Override
    public List<StudentResp> list(StudentQuery query) {
        Student student = BeanUtil.copyProperties(query, Student.class);
        List<Student> list = studentManager.list(Wrappers.query(student));
        return BeanUtil.copyToList(list, StudentResp.class);
    }

    @Override
    public StudentResp detail(Long id) {
        Student student = studentManager.getById(id);
        return BeanUtil.copyProperties(student, StudentResp.class);
    }

    @Override
    public void save(StudentReq req) {
        Student student = BeanUtil.copyProperties(req, Student.class);
        Assert.isTrue(studentManager.save(student), "新增失败");
    }

    @Override
    public void updateById(StudentReq req) {
        Student student = BeanUtil.copyProperties(req, Student.class);
        Assert.isTrue(studentManager.updateById(student), "更新失败");
    }

    @Override
    public void deleteById(Long id) {
        Assert.isTrue(studentManager.removeById(id), "删除失败");
    }


}




