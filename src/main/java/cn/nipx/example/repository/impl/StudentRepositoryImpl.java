package cn.nipx.example.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.nipx.example.mapper.StudentMapper;
import cn.nipx.example.pojo.entity.Student;
import cn.nipx.example.pojo.query.StudentQuery;
import cn.nipx.example.repository.StudentRepository;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生信息-数仓层接口实现类
 *
 * @author NipGeihou
 * @create 2022-08-17 22:34
 */
@Repository
public class StudentRepositoryImpl extends ServiceImpl<StudentMapper, Student> implements StudentRepository {

    @Override
    public List<Student> list(StudentQuery query) {
        Student student = BeanUtil.copyProperties(query, Student.class);
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>(student);
        queryWrapper.orderByDesc(Student::getCreateTime);
        return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    public Student getById(Long id) {
        return super.getById(id);
    }

    @Override
    public boolean removeById(Long id) {
        return super.removeById(id);
    }

    @Override
    public boolean save(Student entity) {
        return super.save(entity);
    }

    @Override
    public boolean updateById(Student entity) {
        return super.updateById(entity);
    }
}
