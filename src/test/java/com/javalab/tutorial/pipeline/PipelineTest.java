package com.javalab.tutorial.pipeline;

import com.javalab.tutorial.pipeline.handler.Handler;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PipelineTest<I, O> {

    private static Handler handlerStep1;
    private static Handler handlerStep2;

    @BeforeAll
    static void setup() {
        handlerStep1 = input-> input.toString() + "HandlerStep1";
        handlerStep2 = input-> input.toString() + "HandlerStep2";
    }

    @Test
    public void given() {
        var result = new Pipeline<I, O>(handlerStep1).addHandler(handlerStep2).execute("Ali");
        assertTrue(((String)result).contains("HandlerStep1") && ((String)result).contains("HandlerStep2"));
    }
}