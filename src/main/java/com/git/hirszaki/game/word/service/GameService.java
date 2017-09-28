package com.git.hirszaki.game.word.service;

import java.util.List;

/**
 * Created by RENT on 2017-09-28.
 */
public interface GameService {

    void addWord(String word);
    List<String> findAllWords();
}
