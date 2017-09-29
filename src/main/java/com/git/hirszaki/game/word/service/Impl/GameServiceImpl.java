package com.git.hirszaki.game.word.service.Impl;

import com.git.hirszaki.game.word.model.Game;
import com.git.hirszaki.game.word.repository.GameRepository;
import com.git.hirszaki.game.word.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-09-28.
 */
@Service
public class GameServiceImpl implements GameService{
    @Autowired
    private GameRepository gameRepository;

    @Override
    public void addWord(String word) {

        /**
         * 1. Pobierz ostatnie dodane słowo
         * 2. Sprawdź czy istnieje, czyli czy nie dodajesz pierwszego słowa
         * 3. jeśli to pierwsze słowo, to zapisz
         * 4. Wpp sprawdź czy pasuje do domina.
         * 5. Jeśli nie pasuje, rzuć wyjątek throw new RuntimeException("nie pasuje")
         * 6. wpp zapisz
         */



        Game game = new Game();
        game.setWord(word);
        game.setTime(LocalDateTime.now());

        gameRepository.save(game);

        //// TODO: 2017-09-28 zapisywanie slowa do bazy gdy pasuje do domina
    }

    @Override
    public List<String> findAllWords() {

        // TODO: 2017-09-28 wyświetlanie wszystkich slow w kolejnosci dodania
        return gameRepository.findAll().stream()
                .sorted(Comparator.comparing(Game::getTime))
                .map(Game::getWord)
                .collect(Collectors.toList());
    }
}
