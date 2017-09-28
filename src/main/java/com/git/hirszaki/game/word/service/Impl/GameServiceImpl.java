package com.git.hirszaki.game.word.service.Impl;

import com.git.hirszaki.game.word.repository.GameRepository;
import com.git.hirszaki.game.word.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by RENT on 2017-09-28.
 */
@Service
public class GameServiceImpl implements GameService{
    @Autowired
    private GameRepository gameRepository;

    @Override
    public void addWord(String word) {
        //// TODO: 2017-09-28 zapisywanie slowa do bazy gdy pasuje do domina
    }

    @Override
    public List<String> findAllWords() {

        // TODO: 2017-09-28 wyświetlanie wszystkich slow w kolejnosci dodania
        return null;
    }
}
