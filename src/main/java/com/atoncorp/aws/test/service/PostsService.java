package com.atoncorp.aws.test.service;

import com.atoncorp.aws.test.domain.posts.PostsRepository;
import com.atoncorp.aws.test.web.dto.PostsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
