package com.git.hirszaki.game.word.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by RENT on 2017-10-02.
 */

    @ControllerAdvice
    public class GlobalErrorHandler {

        @ExceptionHandler(RuntimeException.class)
        @ResponseBody
        public String handleRuntimeException(RuntimeException e) {
            return e.getMessage();
        }
    }

