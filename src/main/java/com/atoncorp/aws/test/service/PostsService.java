package com.atoncorp.aws.test.service;

import com.atoncorp.aws.test.domain.posts.PostsRepository;
import com.atoncorp.aws.test.web.dto.PostsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsRequestDto requestDto){
        Long result = postsRepository.save(requestDto.toEntity()).getId();
        return result;
//        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
