package com.github.miyasumas.multiproject.web;

import com.github.miyasumas.multiproject.common.FizzBuzz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
@Slf4j
public class FizzBuzzController {

    @GetMapping
    public String execute(@RequestParam(name="n") int n) {
        return FizzBuzz.of(n).getMessage();
    }
}
