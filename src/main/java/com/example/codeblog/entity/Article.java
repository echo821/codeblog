package com.example.codeblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String title;
    private String preview;
    private String content;
    private Date date;
    private int state;
}
