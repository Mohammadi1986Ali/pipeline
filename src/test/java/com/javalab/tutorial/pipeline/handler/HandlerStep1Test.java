package com.javalab.tutorial.pipeline.handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandlerStep1Test {
    @Test
    public void givenInput_whenHandlerStep1ProcessedInput_thenResultShouldContainHandlerStep1() {
        Handler<String, String> handler = new HandlerStep1();
        Assertions.assertTrue(handler.process("Some input").contains("HandlerStep1"));
    }
}