package com.test.api.axioma.marvelchallenge.service.impl;

import com.test.api.axioma.marvelchallenge.dto.MyPageable;
import com.test.api.axioma.marvelchallenge.persistence.integration.marvel.dto.ComicDto;
import com.test.api.axioma.marvelchallenge.service.ComicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicServiceImple implements ComicService {
    @Override
    public List<ComicDto> findAll(MyPageable pageable, Long characterId) {
        return null;
    }

    @Override
    public ComicDto findById(Long comicId) {
        return null;
    }
}
