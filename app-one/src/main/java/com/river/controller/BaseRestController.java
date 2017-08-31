package com.river.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jl on 2017/8/31.
 */
public abstract class BaseRestController {
    @Autowired
    protected HttpServletRequest request;
}
