package com.liuqi.cj.easyspringboot.demo.controller;/**
 * @author John
 * @since 2021/12/11 22:32
 */

import com.liuqi.cj.easyspringboot.demo.dao.TestDao;
import com.liuqi.cj.easyspringboot.demo.entity.Test;
import com.lx.mapper.example.CommonExample;
import com.lx.mapper.util.JdbcTemplateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author cj
 * @version 1.0
 * @since 2021/12/11 22:32
 */
@RestController
public class DemoController {

    /**
     * 单表操作简单
     * tk.mybatis的简单运用
     */
    @Resource
    private TestDao testDao;

    @GetMapping(value = "/index")
    public String index() {

        Test test = new Test();
        test.setId(1);

        List<Test> list = testDao.select(test);

        CommonExample<Test> example = CommonExample.of(Test.class);
        example.andEqualTo(Test::getId, 1);
        List<Test> list1 = testDao.selectByExample(example);
        // select * from test where id =1


        // 多表的查询
        String sql = "select name from test where id = ?";
        Object[] paramList = new Object[]{1};
        List<String> list2 = JdbcTemplateUtils.getJdbcTemplate().queryForList(sql, paramList, String.class);
        List<Map> query = JdbcTemplateUtils.query("select * from test where id = 1");

        int chen = testDao.create(new Test("chen", "234"));
        Test test1 = new Test();
        Test testById = testDao.getTestById(1);


        return "hello world";
    }
}
