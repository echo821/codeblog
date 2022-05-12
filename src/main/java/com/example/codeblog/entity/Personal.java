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
public class Personal {
    @TableId(type = IdType.AUTO)
    private String name;
    private String desc;
    private Date birthday;
    private int sex;
    private String interest;
}
