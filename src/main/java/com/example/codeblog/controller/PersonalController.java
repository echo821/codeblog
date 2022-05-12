package com.example.codeblog.controller;


import com.example.codeblog.Resp.Impl.PersonalService;
import com.example.codeblog.entity.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personal")
public class PersonalController {
    @Autowired(required = false)
    private PersonalService personalService;
    @GetMapping("/getById")
    public Personal getById(@RequestParam("id") String name)
    {
        return personalService.getByName(name);
    }
    @PostMapping("/iou")
    public Boolean insertOrUpdate(@RequestBody Personal personal)
    {
        personalService.insertOrUpdate(personal);
        return true;
    }
}
