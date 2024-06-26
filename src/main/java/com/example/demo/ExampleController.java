package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Autowired
    private ExampleRepository repository;

    @GetMapping
    public List<Example> getAll() {
        return repository.findAll();
    }
}
