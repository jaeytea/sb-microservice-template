package com.microservice.template.controller;

import com.microservice.template.service.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/test/n1")
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService){
        this.sampleService=sampleService;
    }

    @GetMapping
    @Operation(summary = "Get sample message")
    public ResponseEntity<String> getSampleMsg(){
        return ResponseEntity.ok(sampleService.getMsg());
    }


}
