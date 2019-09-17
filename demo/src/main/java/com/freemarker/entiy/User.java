package com.freemarker.entiy;

import lombok.Data;

/**
 * @author songabao
 * @date 2019-9-17 16:18
 */
@Data
public class User {
    private String name;
    private String age;
    private String sex;
    private String tel;
    private String address;
    private String email;
    public User(){}
    public User(String name,String age,String sex,String tel,String email,String address){
        this.name = name;
        this.age = age;
        this.sex =sex;
        this.tel=tel;
        this.email = email;
        this.address =address;
    }
}
