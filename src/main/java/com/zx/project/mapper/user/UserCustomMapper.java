package com.hzz.project.mapper.user;


import com.hzz.project.po.user.UserCustom;
import com.hzz.project.po.user.UserQueryVo;

import java.util.List;
import java.util.Set;

/**
 * Created by hong on 2016/12/29.
 */
public interface UserCustomMapper {

    //通过用户名查询用户
    public UserCustom getByUserName(String userName);

    //通过用户名查询角色信息
    public Set<String> getRolesByUserName(String userName);

    //通过角色查询权限信息
    public Set<String> getPermissionsByRole(String roleName);

    //用户查询列表
    public List<UserCustom> getUserList(UserQueryVo userQueryVo);

}
