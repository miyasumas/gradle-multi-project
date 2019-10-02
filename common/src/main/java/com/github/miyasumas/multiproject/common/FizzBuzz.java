package com.github.miyasumas.multiproject.common;

import lombok.Value;

@Value
public class FizzBuzz {

    private int number;

    private String message;

    @Override
    public String toString() {
        return message;
    }

    public static FizzBuzz of(int n) {
        final String m;
        if (n % 3 == 0 && n % 5 == 0) {
            m = "Fizz Buzz";
        } else if (n % 3 == 0) {
            m = "Fizz";
        } else if (n % 5 == 0) {
            m = "Buzz";
        } else {
            m = String.valueOf(n);
        }
        return new FizzBuzz(n, m);
    }
}
