package com.javalab.tutorial.pipeline.handler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlerStep2Test {
    @Test
    public void givenInput_whenHandlerStep2ProcessedInput_thenResultShouldContainHandlerStep2() {
        Handler<String, String> handler = new HandlerStep2();
        assertTrue(handler.process("Some input").contains("HandlerStep2"));
    }
}