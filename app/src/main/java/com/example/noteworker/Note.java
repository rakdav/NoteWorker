package com.example.noteworker;

import java.util.Date;

public class Note {
    private long id;
    private String name;
    private String description;
    private String date;

    public Note(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Note(long id, String name, String description, String date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
