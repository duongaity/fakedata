package com.duong.fakedata.model;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;

}
