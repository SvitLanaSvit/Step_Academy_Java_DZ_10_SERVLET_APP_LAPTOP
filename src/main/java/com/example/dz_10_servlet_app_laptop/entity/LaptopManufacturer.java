package com.example.dz_10_servlet_app_laptop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class LaptopManufacturer {
    private String name;
    private String developmentHistory;
    private List<String> imageUrls;
    private String externalResourceLink;

    public LaptopManufacturer(){
        imageUrls = new ArrayList<>();
    }
}
