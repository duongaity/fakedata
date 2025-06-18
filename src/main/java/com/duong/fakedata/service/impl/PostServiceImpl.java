package com.duong.fakedata.service.impl;

import com.duong.fakedata.model.Post;
import com.duong.fakedata.service.PostService;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {

    private final Faker faker = new Faker();

    @Override
    public List<Post> getFakePosts(int count) {
        List<Post> posts = new ArrayList<>();
        for (long i = 1; i <= count; i++) {
            Post post = new Post();
            post.setPostId(i);
            post.setTitle(faker.book().title());
            post.setContent(faker.lorem().paragraph());
            post.setUserId(UUID.randomUUID());
            posts.add(post);
        }
        return posts;
    }

}
