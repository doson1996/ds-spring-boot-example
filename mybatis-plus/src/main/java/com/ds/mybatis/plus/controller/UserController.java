package com.ds.mybatis.plus.controller;

import com.ds.example.common.result.Result;
import com.ds.mybatis.plus.domain.User;
import com.ds.mybatis.plus.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author ds
 * @Date 2021/4/23 16:58
 * @Description
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("list")
    public Result<List<User>> list() {
        List<User> users = userService.list();

        return  Result.ok("ok", users);
    }

}
