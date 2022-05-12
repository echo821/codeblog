package com.example.codeblog.Resp;

import com.example.codeblog.entity.Personal;

public interface PersonalResp {
    public Personal getByName(String name);
    public Boolean insertOrUpdate(Personal personal);
}
