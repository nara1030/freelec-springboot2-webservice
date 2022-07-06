package org.hjeom.book.web;

import lombok.RequiredArgsConstructor;
import org.hjeom.book.service.posts.PostsService;
import org.hjeom.book.web.dto.PostsResponseDto;
import org.hjeom.book.web.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
