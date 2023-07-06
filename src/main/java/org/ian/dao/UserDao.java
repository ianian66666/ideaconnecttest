package org.ian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ian.pojo.User;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
