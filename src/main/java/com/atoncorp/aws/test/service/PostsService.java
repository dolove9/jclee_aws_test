package com.atoncorp.aws.test.service;

import com.atoncorp.aws.test.domain.posts.Posts;
import com.atoncorp.aws.test.domain.posts.PostsRepository;
import com.atoncorp.aws.test.web.dto.PostsRequestDto;
import com.atoncorp.aws.test.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto updateRequestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));

        posts.update(updateRequestDto.getTitle(), updateRequestDto.getContent());
        return id;
    }
}
