package com.liuqi.cj.easyspringboot.demo.dao;

import com.liuqi.cj.easyspringboot.demo.entity.Test;
import com.lx.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author John
 * @since 2022/4/23 19:32
 */
@Mapper
public interface TestDao extends BaseMapper<Test> {
}
