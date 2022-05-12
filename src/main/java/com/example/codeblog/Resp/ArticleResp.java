package com.example.codeblog.Resp;

import com.example.codeblog.entity.Article;

import java.util.List;

public interface ArticleResp {
    public Boolean Insert(Article article);
    public List<Article> getAll();
    public Boolean delete(Integer id);
    public List<Article> getByCollectId(Integer id);
    public List<Article> getByUid(String name);
}
