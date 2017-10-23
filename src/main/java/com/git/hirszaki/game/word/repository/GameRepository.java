package com.git.hirszaki.game.word.repository;

import com.git.hirszaki.game.word.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RENT on 2017-09-28.
 */
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    Game findFirstByOrderByTimeDesc();


}
