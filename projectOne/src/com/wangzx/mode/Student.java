package com.wangzx.mode;

public class Student {

    private String name ;       // 姓名
    private String age ;        // 年龄

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}