package cn.nipx.example.controller;

import cn.nipx.example.pojo.Result;
import cn.nipx.example.pojo.query.StudentQuery;
import cn.nipx.example.pojo.req.StudentReq;
import cn.nipx.example.pojo.resp.StudentResp;
import cn.nipx.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生信息控制器
 *
 * @author NipGeihou
 */
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    /**
     * 查询学生列表
     *
     * @param query
     * @return
     */
    @GetMapping
    public Result<List<StudentResp>> list(StudentQuery query) {
        return Result.ofSuccess(studentService.list(query));
    }

    /**
     * 查询学生详情
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<StudentResp> detail(@PathVariable Long id) {
        return Result.ofSuccess(studentService.detail(id));
    }

    /**
     * 新增学生
     *
     * @param req
     * @return
     */
    @PostMapping
    public Result<Void> create(@RequestBody @Validated StudentReq req) {
        studentService.save(req);
        return Result.ofSuccessMsg("新增成功");
    }

    /**
     * 更新学生
     *
     * @param req
     * @return
     */
    @PutMapping()
    public Result<Void> update(@RequestBody @Validated StudentReq req) {
        studentService.updateById(req);
        return Result.ofSuccessMsg("更新成功");
    }

    /**
     * 删除学生
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Long id) {
        studentService.deleteById(id);
        return Result.ofSuccessMsg("删除成功");
    }

}
