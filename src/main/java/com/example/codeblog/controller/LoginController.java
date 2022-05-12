package com.example.codeblog.controller;

import com.example.codeblog.Resp.Impl.UserService;
import com.example.codeblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/logincheck")
    public User login(@RequestBody User user){
        User res=userService.login(user.getName(),user.getPassword());
        if(res!=null)
        {
            return res;
        }
        return null;
    }

    @PostMapping("/insertUser")
    public String insertUser(@RequestBody User user)
    {
        return userService.insert(user)?"success":"error";
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user)
    {
        return userService.update(user)?"success":"error";
    }

    @GetMapping("/gal")
    public List<User> getAttentionList(@RequestParam("id") String name)
    {
        return userService.getAttentionList(name);
    }
}
