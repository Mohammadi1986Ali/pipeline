package com.javalab.tutorial.pipeline;

import com.javalab.tutorial.pipeline.handler.HandlerStep1;
import com.javalab.tutorial.pipeline.handler.HandlerStep2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {
        var processResult = new Pipeline<>(new HandlerStep1()).addHandler(new HandlerStep2()).execute("Ali");
        log.info(processResult);
    }
}
