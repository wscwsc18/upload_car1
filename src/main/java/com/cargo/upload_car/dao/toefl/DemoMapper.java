package com.cargo.upload_car.dao.toefl;

import com.cargo.upload_car.entity.Demo;
import org.apache.ibatis.annotations.Mapper;

/**
 * DemoMapper
 *
 * @blame Android Team
 */
@Mapper
public interface DemoMapper extends tk.mybatis.mapper.common.Mapper<Demo>, tk.mybatis.mapper.common.MySqlMapper<Demo> {
}
