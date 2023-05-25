package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String showAllPosts(Model model) {
        List<Post> posts = Arrays.asList(
                new Post("Title 1", "Body 1"),
                new Post("Title 2", "Body 2")
        );
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable int id, Model model) {
        Post post = new Post("Title " + id, "Body " + id);
        model.addAttribute("post", post);
        return "posts/show";
    }
}
