package com.microsoft.azure.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/example-project")
public class SimpleTodoController {



    @PostMapping("/postest")
    @Operation(security = { @SecurityRequirement(name = "Microsoft Entra ID") })
    public ResponseEntity<String> trySimplePost(@Valid @RequestBody(required = false) String simpleString) {
        return new ResponseEntity<String>(simpleString + "modificato",HttpStatus.OK);

    }


    @GetMapping("/getest")
    @Operation(security = { @SecurityRequirement(name = "Microsoft Entra ID") })
    public ResponseEntity<String> trySimpleGet(@RequestParam(name = "stringa",required = false)String stringa) {
        return new ResponseEntity<String>(stringa+"modificato",HttpStatus.OK);
    }


}
