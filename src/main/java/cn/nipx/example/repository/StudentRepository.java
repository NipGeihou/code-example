package cn.nipx.example.repository;

import cn.nipx.example.pojo.entity.Student;
import cn.nipx.example.pojo.query.StudentQuery;

import java.util.List;

/**
 * 学生信息-数仓层接口
 *
 * @author NipGeihou
 * @create 2022-08-17 22:34
 */
public interface StudentRepository {

    /**
     * 学生列表
     *
     * @param query
     * @return
     */
    List<Student> list(StudentQuery query);

    /**
     * 通过ID获取学生信息
     *
     * @param id
     * @return
     */
    Student getById(Long id);

    /**
     * 新增学生信息
     *
     * @param student
     * @return
     */
    boolean save(Student student);

    /**
     * 更新学生信息
     *
     * @param student
     * @return
     */
    boolean updateById(Student student);

    /**
     * 通过ID删除学生信息
     *
     * @param id
     * @return
     */
    boolean removeById(Long id);
}
