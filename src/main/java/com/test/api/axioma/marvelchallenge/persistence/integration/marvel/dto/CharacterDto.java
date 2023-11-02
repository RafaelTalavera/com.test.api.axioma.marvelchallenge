package com.test.api.axioma.marvelchallenge.persistence.integration.marvel.dto;

public record CharacterDto(
        Long id,
        String name,
        String description,
        String modified,
        String modifiedURI
) {

    public static record CharacterInfoDto(
            String imagePath,
            String description
    ){

    }
}
