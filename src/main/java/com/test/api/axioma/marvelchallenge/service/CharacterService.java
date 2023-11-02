package com.test.api.axioma.marvelchallenge.service;

import com.test.api.axioma.marvelchallenge.dto.MyPageable;
import com.test.api.axioma.marvelchallenge.persistence.integration.marvel.dto.CharacterDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CharacterService {
    List<CharacterDto> findAll(MyPageable pegeable, String name, int[] comics, int[] series);

    CharacterDto.CharacterInfoDto findInfoById(Long characterId);

}
