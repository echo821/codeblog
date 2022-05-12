package com.example.codeblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectorArticle {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private int cid;

    private int aid;
}
