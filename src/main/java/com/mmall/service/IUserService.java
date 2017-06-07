package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Administrator on 2017-6-6 0006.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
