package com.sample.demo.controller;

import com.sample.demo.TestAnnotation;
import org.springframework.web.bind.annotation.*;

/**
 * @author M.khoshnevisan
 * @since 1/2/2023
 */
@RequestMapping
@RestController
public class TestController {

    @RequestMapping(path = "/test" ,method = RequestMethod.GET)
    @TestAnnotation
    public void test() {
        System.out.println("test");
    }
}
