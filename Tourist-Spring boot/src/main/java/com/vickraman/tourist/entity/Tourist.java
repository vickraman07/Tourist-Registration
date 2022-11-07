package com.vickraman.tourist.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tourist_TBL")
public class Tourist {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private String fromPlace;
    private int no_of_day_visit;

}
