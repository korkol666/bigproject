package com.neuedu.mapper;

import com.neuedu.pojo.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer userroleid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer userroleid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}