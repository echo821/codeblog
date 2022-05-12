package com.example.codeblog;

import com.example.codeblog.entity.Article;
import com.example.codeblog.mapper.ArticleMapper;
import com.example.codeblog.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
class CodeBlogApplicationTests {

    @Autowired(required = false)
    private ArticleMapper articleMapper;
    @Test
    void contextLoads() {
        System.out.println(articleMapper.selectList(null));
    }

}
