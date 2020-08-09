package com.example.iexcel.controller;

import com.github.houbb.iexcel.annotation.ExcelField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @ExcelField(headName="姓名")
    private String name;

    @ExcelField(headName = "年龄")
    private int age;

    //fluent getter/setter/toString()

    /**
     * 构建用户类表
     * @return 用户列表
     * @since 0.0.4
     */
    public static List<User> buildUserList() {
        List<User> users = new ArrayList<>();
        users.add(User.builder().name("hello").age(20).build());
        users.add(User.builder().name("excel").age(19).build());
        return users;
    }
}
