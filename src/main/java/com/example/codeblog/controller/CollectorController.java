package com.example.codeblog.controller;

import com.example.codeblog.Resp.Impl.CollectorService;
import com.example.codeblog.entity.Article;
import com.example.codeblog.entity.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collector")
public class CollectorController {
    @Autowired
    private CollectorService collectorService;

    @GetMapping("/add")
    public Boolean add(@RequestParam(value = "cname") String cname,@RequestParam(value = "uname") String uname){
        System.out.println(cname+"-"+uname);
        collectorService.insert(new Collector(null,cname,uname));
        return true;
    }

    @GetMapping("/gbu")
    public List<Collector> getByUID(@RequestParam(value = "uname") String uname)
    {
        System.out.println("gbu get-"+uname);

        List<Collector> res=collectorService.getCollectorByUID(uname);
        System.out.println(res);
        return collectorService.getCollectorByUID(uname);
    }

    @RequestMapping("/collect")
    public Boolean collect(@RequestParam(value = "cid") Integer cid,@RequestParam(value = "aid") Integer aid)
    {
        return collectorService.collect(cid,aid);
    }

    @RequestMapping("/delete")
    public Boolean delete(@RequestParam(value = "id") Integer cid)
    {
        collectorService.delete(cid);
        return true;
    }
    @PostMapping("/deletelist")
    public Boolean delete(@RequestBody List<Integer> ids)
    {
        collectorService.deleteList(ids);
        return true;
    }

}
