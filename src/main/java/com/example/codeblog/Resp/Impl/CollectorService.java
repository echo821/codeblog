package com.example.codeblog.Resp.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.codeblog.Resp.CollectorResp;
import com.example.codeblog.entity.Collector;
import com.example.codeblog.entity.CollectorArticle;
import com.example.codeblog.mapper.CollectorArticleMapper;
import com.example.codeblog.mapper.CollectorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CollectorService implements CollectorResp {
    @Autowired(required = false)
    private CollectorMapper collectorMapper;

    @Autowired(required = false)
    private CollectorArticleMapper collectorArticleMapper;

    @Override
    public Boolean insert(Collector collector) {
        collectorMapper.insert(collector);
        return true;
    }

    @Override
    public List<Collector> getCollectorByUID(String name) {
        QueryWrapper<Collector> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname",name);
        return collectorMapper.selectList(queryWrapper);
    }

    @Override
    public Boolean collect(int cid, int aid) {
        collectorArticleMapper.insert(new CollectorArticle(null,cid,aid));
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        collectorMapper.deleteById(id);
        QueryWrapper<CollectorArticle> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cid",id);
        collectorArticleMapper.delete(queryWrapper);
        return true;
    }

    @Override
    public Boolean deleteList(List<Integer> list) {
        for(Integer cur:list)
            delete(cur);
        return true;
    }
}
