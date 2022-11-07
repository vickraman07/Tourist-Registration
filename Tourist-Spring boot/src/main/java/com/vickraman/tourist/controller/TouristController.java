package com.vickraman.tourist.controller;

import com.vickraman.tourist.entity.Tourist;
import com.vickraman.tourist.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tourist")
@CrossOrigin(origins = "*")
public class TouristController {
    @Autowired
    private TouristService service;

    @PostMapping("/addTourist")
    public Tourist addTourist(@RequestBody Tourist tourist) {
         return service.saveTourist(tourist);


    }

    @PostMapping("/addTourists")
    public List<Tourist> addTourists(@RequestBody List<Tourist> tourists) {
        return service.saveTourists(tourists);

    }

    @GetMapping("/tourists")
    public List<Tourist> findAllTourists() {
        return service.getTourist();

    }

    @GetMapping("/{field}")
    public List<Tourist> findAllTouristsWithSort(@PathVariable String field) {
        List<Tourist> allArticles=service.findAllTouristsWithSort(field);
        return allArticles;
    }

    @GetMapping("/touristsById/{id}")
    public Tourist findTouristById(@PathVariable int id) {
        return service.getTouristById(id);
    }

    @GetMapping("/tourist/{name}")
    public Tourist findTouristByName(@PathVariable String name) {
        return service.getTouristByName(name);
    }

    @PutMapping("/update")
    public Tourist updateTourist(@RequestBody Tourist tourist) {
        return service.updateTourist(tourist);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTourist(@PathVariable int id) {
         return service.deleteTourist(id);

    }


}
