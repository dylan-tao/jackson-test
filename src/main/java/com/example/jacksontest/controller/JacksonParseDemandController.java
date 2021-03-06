package com.example.jacksontest.controller;

import com.example.jacksontest.metadata.input;
import org.springframework.web.bind.annotation.*;

/**
 * @author taodizhou
 * @date 2022/6/18 14:22.
 * Copyright 2022 Fico Tech, All Rights Reserved.
 */
@RestController
@RequestMapping("/jackson")
public class JacksonParseDemandController {

    @PostMapping("/test")
    public input jsonParseOnDemand(@RequestBody String json) throws Exception {
        input input = new input();
        input.parseFillProperty(json);
        return input;
    }

    @PostMapping("/test-fix")
    public com.example.jacksontest.metadata.fix.input jsonParseOnDemandFix(@RequestBody String json) throws Exception {
        com.example.jacksontest.metadata.fix.input input = new com.example.jacksontest.metadata.fix.input();
        input.parseFillProperty(json);
        return input;
    }
}
