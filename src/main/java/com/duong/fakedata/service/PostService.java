package com.duong.fakedata.service;

import com.duong.fakedata.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getFakePosts(int count);
}
