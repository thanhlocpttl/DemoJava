package com.example.springdeploy.controller;

import com.example.springdeploy.model.Accounts;
import com.example.springdeploy.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Value("${upload.link}")
    private String imageLink;

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/hello-world")
    public ResponseEntity<Object> helloWorld(){
        return new ResponseEntity<>("HelloWorld", HttpStatus.OK);
    }

    @GetMapping("/accounts")
    public ResponseEntity<Object> getAccounts(){
        List<Accounts> accountsList = accountRepository.findAll();
        return new ResponseEntity<>(accountsList, HttpStatus.OK);
    }
}
