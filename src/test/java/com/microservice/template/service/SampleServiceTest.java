package com.microservice.template.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleServiceTest {

    @Autowired
    SampleService sampleService;

    @Test
    void testMessage(){

        String result = sampleService.getMsg();

        assertEquals("Microservice-template looks good!", result);

    }

}
