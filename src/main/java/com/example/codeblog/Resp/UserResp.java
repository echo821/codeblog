package com.example.codeblog.Resp;

import com.example.codeblog.entity.User;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface UserResp {
    public List<User> getUsers();
    public User login(String name,String password);
    public Boolean exist(String name);
    public Boolean UpdateOrInsert(User user);
    public Boolean update(User user);
    public Boolean insert(User user);
    public List<User> getAttentionList(String name);
}
