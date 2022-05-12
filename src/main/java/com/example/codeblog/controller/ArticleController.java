package com.example.codeblog.controller;

import com.example.codeblog.Resp.Impl.ArticleService;
import com.example.codeblog.entity.Article;
import com.example.codeblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired(required = false)
    private ArticleService articleService;

    @PostMapping("/submit")
    public Boolean insert(@RequestBody Article article)
    {
        article.setDate(new Date(System.currentTimeMillis()));
        articleService.Insert(article);
        return true;
    }

    @GetMapping("/getall")
    public List<Article> getAll(){
        return articleService.getAll();
    }

    @GetMapping("/getbycid")
    public List<Article> getByCid(@RequestParam("id")Integer id)
    {
        return articleService.getByCollectId(id);
    }
}
