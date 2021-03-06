package com.neuedu.mapper;

import com.neuedu.pojo.RoleMenu;

public interface RoleMenuMapper {
    int deleteByPrimaryKey(Integer rmid);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Integer rmid);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
    
    /*
     * 根据角色id和权限id删除rolemenu中的数据
     * */
    
    int deleteByRoleidMenuid(RoleMenu roleMenu);
}