package com.test.api.axioma.marvelchallenge.web.controller;

import com.test.api.axioma.marvelchallenge.dto.MyPageable;
import com.test.api.axioma.marvelchallenge.persistence.integration.marvel.dto.ComicDto;
import com.test.api.axioma.marvelchallenge.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comics")
public class ComicController {

    @Autowired
    private ComicService comicService;

    @GetMapping
    public ResponseEntity<List<ComicDto>> findAll(
            @RequestParam(required = false) Long characyerId,
            @RequestParam(defaultValue = "0") long offset,
            @RequestParam(defaultValue = "10") long limit
    )
    {
        MyPageable pageable = new MyPageable(offset, limit);
        return ResponseEntity.ok(comicService.findAll(pageable, characyerId));
    }

    @GetMapping("/{comicId}")
    public ResponseEntity<ComicDto> findById(
            @PathVariable Long comicId
    )
    {
        return ResponseEntity.ok(comicService.findById(comicId));
    }
}
