package com.example.demo.controller;

import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.*;

import java.util.*;

@RestController
@RequestMapping(value= "/api/demo")
public class demoController {
    @Autowired
    daoMongo daomongo;

    @PostMapping(value= "/")
    public String create(@RequestBody demoMongo obj) {
        daomongo.save(obj);
        return "Employee records created.";
    }

    @GetMapping(value= "/")
    public Collection<demoMongo> getAll() {
        return daomongo.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<demoMongo> getById(@PathVariable("id") String id) {
        Optional<demoMongo> item = daomongo.findById(id);
        return item;
    }

}
