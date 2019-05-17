package com.marksman.mybatis.generator.gradle.plugin.entity;

public class User {
    private Integer id;

    private String name;

    private Byte age;

    private Integer height;

    private String desc;

    public User(Integer id, String name, Byte age, Integer height, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.desc = desc;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}