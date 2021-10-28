package com.timeserie.timeserie.model;

import java.util.UUID;

public class Series {

    private UUID id;
    private String title;
    private String description;

    public Series(String title, String description){
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
    }
    
}
