package com.microservice.template.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class SampleService {

    private static final Logger logger= LoggerFactory.getLogger(SampleService.class);

    public String getMsg(){
       logger.info("Generating sample message...");
        return "Microservice-template looks good!";
    }
}
