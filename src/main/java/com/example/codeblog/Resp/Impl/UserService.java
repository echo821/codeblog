package com.example.codeblog.Resp.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.codeblog.Resp.UserResp;
import com.example.codeblog.entity.Attention;
import com.example.codeblog.entity.User;
import com.example.codeblog.mapper.AttentionMapper;
import com.example.codeblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserService implements UserResp {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private AttentionMapper attentionMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public User login(String name, String password) {
        User user=userMapper.selectById(name);
        if(user==null||(!password.equals(user.getPassword()))){
            return null;
        }
        return user;
    }

    @Override
    public Boolean exist(String name) {
        User user=userMapper.selectById(name);
        if(user==null)
            return false;
        return true;
    }

    @Override
    public Boolean UpdateOrInsert(User user) {
        User res=userMapper.selectById(user.getName());
        if(user==null)
            userMapper.insert(user);
        else
            userMapper.updateById(user);
        return true;
    }

    @Override
    public Boolean update(User user) {
        User res=userMapper.selectById(user.getName());
        if(user==null)
            return false;
        userMapper.updateById(user);
        return true;
    }

    @Override
    public Boolean insert(User user) {
        User res=userMapper.selectById(user.getName());
        if(user!=null)
            return false;
        userMapper.insert(user);
        return true;
    }

    @Override
    public List<User> getAttentionList(String name) {
        QueryWrapper<Attention>q=new QueryWrapper<>();
        q.select("utid").eq("ufid",name);
        List<Object> utids=attentionMapper.selectObjs(q);
        QueryWrapper<User>q2=new QueryWrapper<>();
        q2.in("name",utids);
        return userMapper.selectList(q2);
    }
}
