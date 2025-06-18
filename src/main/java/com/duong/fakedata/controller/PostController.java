package com.duong.fakedata.controller;

import com.duong.fakedata.model.Post;
import com.duong.fakedata.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getFakePosts(@RequestParam(defaultValue = "10") int count) {
        List<Post> postList = postService.getFakePosts(count);
        return ResponseEntity.ok(postList);
    }

}
