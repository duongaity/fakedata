package com.duong.fakedata.service;

import com.duong.fakedata.model.User;

import java.util.List;

public interface UserService {
    List<User> getFakeUsers(int count);
}
