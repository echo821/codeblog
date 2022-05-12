package com.example.codeblog.Resp.Impl;

import com.example.codeblog.Resp.PersonalResp;
import com.example.codeblog.entity.Personal;
import com.example.codeblog.mapper.PersonalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalService implements PersonalResp {
    @Autowired(required = false)
    private PersonalMapper personalMapper;

    @Override
    public Personal getByName(String name) {
        return personalMapper.selectById(name);
    }

    @Override
    public Boolean insertOrUpdate(Personal personal) {
        Personal exist=getByName(personal.getName());
        if(exist==null)
            personalMapper.insert(personal);
        else
            personalMapper.updateById(personal);
        return true;
    }
}
