package com.itheima.mapper;

import com.itheima.domain.Loginusers;

public interface LoginusersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Loginusers record);

    int insertSelective(Loginusers record);

    Loginusers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loginusers record);

    int updateByPrimaryKey(Loginusers record);
}