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
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepository gameRepository;

    @Override
    public void addWord(String word) {

        /**
         * 1. Dodaj klasę User, która będzie @Entity
         * 2. Niech implementuje UserDetails
         * 3. Zaimplementuj UserDetailsService, NIE annotuj go @Service
         * 4. Dodaj WebSecurityConfigAdapter, skonfiguruj go jak na GH - form login itp
         * 5. W tym adapterze stwórz beana UserDetailsServiceImpl
         * 6. Stwórz stronkę do logowania (też GH)
         * 7. Dodaj filtrowanie przy wyszukiwaniu słów, aby wyszukiwał tylko słowa,
         *      aktualnie zalogowanego użytkownika
     *          (por. SecurityContextHolder.getContext().getAuthentication())
         */


        Game game = new Game();
        game.setWord(word);
        game.setTime(LocalDateTime.now());


        if (gameRepository.findAll().isEmpty()) {
            gameRepository.save(game);
        } else if
                (gameRepository.findFirstByOrderByTimeDesc().getWord().endsWith(word.substring(0,1))){
            gameRepository.save(game);
            } else {
                throw new RuntimeException("The word does not match to our domino");
            }
        }


        @Override
        public List<String> findAllWords () {

            return gameRepository.findAll().stream()
                    .sorted(Comparator.comparing(Game::getTime))
                    .map(Game::getWord)
                    .collect(Collectors.toList());
        }
    }
