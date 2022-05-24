package com.example.cn.zhanshiredis.entity;

public class CountValueName {
    private int value;

    private String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ValueName{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
