package com.example.codeblog.Resp.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.codeblog.Resp.ArticleResp;
import com.example.codeblog.entity.Article;
import com.example.codeblog.entity.Collector;
import com.example.codeblog.entity.CollectorArticle;
import com.example.codeblog.mapper.ArticleMapper;
import com.example.codeblog.mapper.ArticleUserMapper;
import com.example.codeblog.mapper.CollectorArticleMapper;
import com.example.codeblog.mapper.CollectorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class ArticleService implements ArticleResp {
    @Autowired(required = false)
    private ArticleMapper articleMapper;


    @Autowired(required = false)
    private CollectorArticleMapper collectorArticleMapper;

    @Autowired(required = false)
    private ArticleUserMapper articleUserMapper;

    @Override
    public Boolean Insert(Article article) {
        articleMapper.insert(article);
        return true;
    }

    @Override
    public List<Article> getAll() {
        return articleMapper.selectList(null);
    }

    @Override
    public Boolean delete(Integer id) {
        articleMapper.deleteById(id);
        return true;
    }

    @Override
    public List<Article> getByCollectId(Integer id) {
        QueryWrapper<CollectorArticle> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("aid").eq("cid",id);
        List<Object> aids= collectorArticleMapper.selectObjs(queryWrapper);
        if(aids==null||aids.size()==0)
            return null;
        QueryWrapper<Article> queryWrapper1=new QueryWrapper<>();
        queryWrapper1.in("id",aids);
        return articleMapper.selectList(queryWrapper1);
    }

    @Override
    public List<Article> getByUid(String name) {
        return null;
    }

}
