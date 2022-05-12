package com.example.codeblog.Resp;

import com.example.codeblog.entity.Collector;

import java.util.List;

public interface CollectorResp {
    public Boolean insert(Collector collector);
    public List<Collector> getCollectorByUID(String name);
    public Boolean collect(int cid,int aid);
    public Boolean delete(Integer id);
    public Boolean deleteList(List<Integer>list);
}
