package com.duong.fakedata.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Post {

    private Long postId;
    private String title;
    private String content;
    private UUID userId;

}
