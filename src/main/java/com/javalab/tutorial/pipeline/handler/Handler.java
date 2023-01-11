package com.javalab.tutorial.pipeline.handler;

public interface Handler<I, O> {

    O process (I input);
}
