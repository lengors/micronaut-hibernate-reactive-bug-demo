package io.github.lengors;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut
            .build(args)
            .classes(Application.class)
            .eagerInitSingletons(true)
            .start();
    }
}