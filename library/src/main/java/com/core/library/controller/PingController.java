package com.core.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MRegra on 14/09/2023
 */
@RestController
public class PingController {

    @GetMapping
    public String ping(){
        return "pong";
    }
}
