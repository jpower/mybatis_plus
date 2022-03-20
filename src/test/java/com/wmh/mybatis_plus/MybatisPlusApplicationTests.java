package com.wmh.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wmh.mybatis_plus.mapper.UserMapper;
import com.wmh.mybatis_plus.mapstruct.UserCovertBasic;
import com.wmh.mybatis_plus.pojo.User;
import com.wmh.mybatis_plus.pojo.Wmh;
import com.wmh.mybatis_plus.vo.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCovertBasic userCovertBasic;

    @Test
    public void selectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void insert() {
        User user = new User();
        user.setAge(1234);
        user.setEmail("dsf");
        user.setName("wmh");
        System.out.println(userMapper.insert(user));
        System.out.println(user);
    }

    @Test
    void fun1() {
        LambdaQueryWrapper<User> userQueryWrapper = new LambdaQueryWrapper<>();
        userQueryWrapper.eq(User::getName, "wmh");
        List<User> userList = userMapper.selectList(userQueryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    void fun2() {
        Page<User> userPage = userMapper.selectPageVo(new Page<>(1, 3), 10);
        userPage.getRecords().forEach(System.out::println);
        System.out.println(userPage.getTotal());
    }

    @Test
    void fun3() {
        User user = userMapper.selectById(1502952542429745154L);
//        UserVo userVo = UserCovertBasic.INSTANCE.userToUserVo(user);
        UserVo userVo = userCovertBasic.userToUserVo(user);
        System.out.println();
        System.out.println(user);
        System.out.println();
        System.out.println(userVo);
    }

    @Test
    void fun4() {
        User user = new User();
        user.setId(1504720683245678593L);
        user.setName("最新");
        userMapper.updateById(user);
    }

    @Test
    void fun5() {
        User user = new User();
        user.setId(1504720683245678593L);
        user.setName("最新1111");
        userMapper.updateById(user);
        userMapper.deleteById(user);
    }
}
