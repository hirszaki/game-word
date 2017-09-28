package com.git.hirszaki.game.word.controller;

import com.git.hirszaki.game.word.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RENT on 2017-09-28.
 */

@RestController
@RequestMapping("/api/snake")
public class GameController {

    @Autowired
    private GameService gameService;

    //// TODO: 2017-09-28 endpoint przyjmujacy slowo od uzytkownika

}
