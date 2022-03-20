package com.wmh.mybatis_plus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    public static final Date DATE = new Date();


    @Override
    public void insertFill(MetaObject metaObject) {
        Class<?> createTime = metaObject.getSetterType("createTime");

        if (createTime.isInstance(DATE)) {
            this.strictInsertFill(metaObject, "createTime", Date::new, Date.class);

        } else {
            this.strictInsertFill(metaObject, "createTime", LocalDateTime::now, LocalDateTime.class);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Class<?> createTime = metaObject.getSetterType("createTime");

        if (createTime.isInstance(DATE)) {
            this.strictUpdateFill(metaObject, "updateTime", Date::new, Date.class);

        } else {
            this.strictUpdateFill(metaObject, "updateTime", LocalDateTime::now, LocalDateTime.class);

        }
    }

}
