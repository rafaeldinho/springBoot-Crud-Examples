package com.example.demo.controller;
import com.datastax.driver.core.utils.UUIDs;
import com.example.demo.model.demoModel;
import com.example.demo.repository.demoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/demo")
public class demoController {
    @Autowired
    demoDao dao;

    @GetMapping("/")
    public List<demoModel> getAllCustomers() {
        List<demoModel> itemLst = new ArrayList<>();
        dao.findAll().forEach(itemLst::add);
        return itemLst;
    }

    @PostMapping(value= "/")
    public demoModel createCs(@RequestBody demoModel obj) {
        obj.setId(UUIDs.timeBased());
        demoModel item = dao.save(obj);
        return item;
    }
}
