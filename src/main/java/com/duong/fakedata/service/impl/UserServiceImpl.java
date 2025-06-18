package com.duong.fakedata.service.impl;

import com.duong.fakedata.model.User;
import com.duong.fakedata.service.UserService;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final Faker faker = new Faker();

    @Override
    public List<User> getFakeUsers(int count) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            UUID uuid = UUID.randomUUID();
            User user = new User();
            user.setUserId(uuid);
            user.setFirstName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setEmail(faker.internet().emailAddress());
            users.add(user);
        }
        return users;
    }

}
