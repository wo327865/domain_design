package com.river.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jl on 2017/8/31.
 */
@RestController
public class UserController extends BaseRestController {

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable long id) {
        return "no user";
    }
}
