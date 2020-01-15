package com.atoncorp.aws.test.web;

import com.atoncorp.aws.test.service.PostsService;
import com.atoncorp.aws.test.web.dto.PostsRequestDto;
import com.sun.media.sound.SF2InstrumentRegion;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts")
    public Long save(@RequestBody PostsRequestDto requestDto){
        return postsService.save(requestDto);
    }
}
