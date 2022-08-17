package cn.nipx.example.service;

import cn.nipx.example.pojo.query.StudentQuery;
import cn.nipx.example.pojo.req.StudentReq;
import cn.nipx.example.pojo.resp.StudentResp;

import java.util.List;

/**
 * 学生信息服务接口
 *
 * @author NipGeihou
 */
public interface StudentService {

    /**
     * 查询学生列表
     *
     * @param query
     * @return
     */
    List<StudentResp> list(StudentQuery query);

    /**
     * 查询学生详情
     *
     * @param id
     * @return
     */
    StudentResp detail(Long id);

    /**
     * 新增学生
     *
     * @param req
     * @return
     */
    void save(StudentReq req);

    /**
     * 更新学生
     *
     * @param req
     */
    void updateById(StudentReq req);


    /**
     * 删除学生
     *
     * @param id
     */
    void deleteById(Long id);
}
