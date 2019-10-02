package com.github.miyasumas.multiproject.cli;

import com.github.miyasumas.multiproject.common.FizzBuzz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Slf4j
public class FizzBuzzTask {

    @Scheduled(fixedDelay = 5000)
    public void say() {
        int n = new Random().nextInt(100);
        FizzBuzz fizzBuzz = FizzBuzz.of(n);
        log.info("{} -> {}", n, fizzBuzz);
    }
}
