package com.wmh.mybatis_plus.mapstruct;

import com.wmh.mybatis_plus.pojo.User;
import com.wmh.mybatis_plus.pojo.Wmh;
import com.wmh.mybatis_plus.vo.UserVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserCovertBasic {
//    UserCovertBasic INSTANCE = Mappers.getMapper(UserCovertBasic.class);
    UserVo userToUserVo(User user);
}
