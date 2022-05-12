package com.example.codeblog.controller;

import com.example.codeblog.Resp.Impl.AttentionService;
import com.example.codeblog.entity.Attention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attention")
public class AttentionController {

    @Autowired
    private AttentionService attentionService;
    @GetMapping("/add")
    public Boolean add(@RequestParam(value = "ufid") String ufid, @RequestParam(value = "utid") String utid)
    {
        attentionService.add(new Attention(null,ufid,utid));
        return true;
    }
}
