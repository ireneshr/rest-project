package com.irene.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Character {

    @Id
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String house;
    @Column
    private String city;
    @Column
    private String quote;

    public Character() {
    }

    public Character(long id, String name, String house, String city, String quote) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.city = city;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", house='" + house + '\'' +
                ", city='" + city + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }

}
