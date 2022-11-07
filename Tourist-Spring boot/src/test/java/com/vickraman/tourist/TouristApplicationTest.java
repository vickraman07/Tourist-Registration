package com.vickraman.tourist;

import com.vickraman.tourist.controller.TouristController;
import com.vickraman.tourist.entity.Tourist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TouristApplicationTest {

    @Autowired
    TouristController TouristController;


    @Test
    public void checkInfo1(){
        Tourist tourist=TouristController.findTouristById(1);
        assertEquals(tourist.getName(),"VICKRAMAN");

    }

    @Test
    public void checkInfo2(){
        Tourist tourist=TouristController.findTouristByName("KEERTHAN");
        assertEquals(tourist.getAge(),15);

    }

    @Test
    public void checkInfo3(){
        Tourist tourist=TouristController.findTouristById(4);
        assertEquals(tourist.getGender(),"MALE");
    }

    @Test
    public  void saveInfo(){
        Tourist tourist=new Tourist(4,"RAVI","KUMAR","MALE",55,"NOIDA",56);
        TouristController.addTourist(tourist);
    }


}