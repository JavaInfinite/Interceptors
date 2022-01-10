package com.javainfinite.interceptor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class InterceptorController {

    Logger logger = LoggerFactory.getLogger(InterceptorController.class);

    @GetMapping("/interceptor")
    public String homepage(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        logger.info("Controller method invoked");
        model.addAttribute("Interceptor", request.getAttribute("Interceptor"));
        model.addAttribute("Status", response.getStatus());
        return "hello " + request.getAttribute("Interceptor") + " " + response.getStatus();
    }
}
