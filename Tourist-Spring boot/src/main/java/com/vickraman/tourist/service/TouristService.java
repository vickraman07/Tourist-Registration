package com.vickraman.tourist.service;

import com.vickraman.tourist.entity.Tourist;
import com.vickraman.tourist.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    @Autowired
    private TouristRepository repository;

    public Tourist saveTourist(Tourist tourist) {
        return repository.save(tourist);

    }

    public List<Tourist> saveTourists(List<Tourist> tourists) {
        return repository.saveAll(tourists);
    }

    public List<Tourist> getTourist() {
        return repository.findAll();

    }

    public List<Tourist> findAllTouristsWithSort(String field){
        return repository.findAll(Sort.by(Sort.Direction.DESC,field));
    }


    public Tourist getTouristById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Tourist getTouristByName(String name) {
        return repository.findByName(name);
    }

    public String deleteTourist(int id) {
        repository.deleteById(id);
        return "tourist removed id;!! " +id;
    }

    public Tourist updateTourist(Tourist tourist) {
        Tourist existingTourist = repository.findById(tourist.getId()).orElse(null);
        existingTourist.setName(tourist.getName());
        existingTourist.setLastName(tourist.getLastName());
        existingTourist.setGender(tourist.getGender());
        existingTourist.setAge(tourist.getAge());
        existingTourist.setFromPlace(tourist.getFromPlace());
        existingTourist.setNo_of_day_visit(tourist.getNo_of_day_visit());
        return repository.save(existingTourist);


    }
}
