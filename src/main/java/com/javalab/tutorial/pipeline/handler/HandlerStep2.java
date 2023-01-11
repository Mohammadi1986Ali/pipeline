package com.javalab.tutorial.pipeline.handler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HandlerStep2 implements Handler<String, String> {
    @Override
    public String process(String input) {
        log.info("HandlerStep2 is processing: {}", input);
        return input + " and HandlerStep2";
    }
}
