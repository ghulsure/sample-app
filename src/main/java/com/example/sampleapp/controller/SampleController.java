package com.example.sampleapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.UUID;

/**
 * Sample app controller
 * @Version 1.0
 * @Since 05-09-2023
 */

@RestController
@RequestMapping("/sample")
public class SampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    /**
     * This is an sample get api which return static string
     * @param applicationName
     * @return
     * @throws IOException
     */
    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createOIDCAgencyToWandTPSaml(@RequestParam String applicationName)  {

        String uniqueIdentifier = "[" + UUID.randomUUID() + "]";
        logger.info("************START*****************");
        logger.info("input application name is --{}", applicationName);
        return ResponseEntity.ok()
                .headers(getHttpHeaders())
                .body("Test is successful");
    }

    private HttpHeaders getHttpHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CACHE_CONTROL, "no-store");
        headers.add(HttpHeaders.PRAGMA, "no-cache");
        headers.add("Strict-Transport-Security", "max-age=63072000");
        return headers;
    }

}
