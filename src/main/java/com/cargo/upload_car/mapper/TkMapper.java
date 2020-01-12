package com.cargo.upload_car.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;



/**
 * TkMapper
 *
 * @blame Android Team
 */
@Repository
public interface TkMapper<T> extends Mapper<T>, MySqlMapper<T> {

}

