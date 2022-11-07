package com.vickraman.tourist.repository;

import com.vickraman.tourist.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristRepository extends JpaRepository<Tourist,Integer> {
    Tourist findByName(String name);
}
