package com.example.codeblog.Resp.Impl;

import com.example.codeblog.Resp.AttentionResp;
import com.example.codeblog.entity.Attention;
import com.example.codeblog.mapper.AttentionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AttentionService implements AttentionResp {
    @Autowired(required = false)
    private AttentionMapper attentionMapper;

    @Override
    public Boolean add(Attention attention) {
        attentionMapper.insert(attention);
        return true;
    }
}
