package com.example.dz_10_servlet_app_laptop.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewsItem {
    private int id;
    private String title;
    private String shortDescription;
    private String imageUrl;
}
