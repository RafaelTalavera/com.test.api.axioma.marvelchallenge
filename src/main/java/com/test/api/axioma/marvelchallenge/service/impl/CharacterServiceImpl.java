package com.test.api.axioma.marvelchallenge.service.impl;

import com.test.api.axioma.marvelchallenge.dto.MyPageable;
import com.test.api.axioma.marvelchallenge.persistence.integration.marvel.dto.CharacterDto;
import com.test.api.axioma.marvelchallenge.service.CharacterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Override
    public List<CharacterDto> findAll(MyPageable pegeable, String name, int[] comics, int[] series) {
        return null;
    }

    @Override
    public CharacterDto.CharacterInfoDto findInfoById(Long characterId) {
        return null;
    }
}
