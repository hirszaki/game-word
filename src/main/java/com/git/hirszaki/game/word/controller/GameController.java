package com.git.hirszaki.game.word.controller;

import com.git.hirszaki.game.word.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by RENT on 2017-09-28.
 */

@RestController
@RequestMapping("/api/snake")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/add-word")
    public void addWord(@RequestParam String word) {

        gameService.addWord(word);
    }

    @GetMapping
    public List<String> findAll() {
        return gameService.findAllWords();
    }

}


//// TODO: 2017-09-28 endpoint przyjmujacy slowo od uzytkownika

