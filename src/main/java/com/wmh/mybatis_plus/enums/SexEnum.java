package com.wmh.mybatis_plus.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

public enum SexEnum implements IEnum<Integer> {
    MALE(1, "男"),
    FEMALE(0, "女");

    private int value;
    private String desc;

    SexEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
