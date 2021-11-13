package com.example.obspringej789.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "laptops")
public class Laptop {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private Integer ram;
    private Double screenSize;
    private LocalDate releaseDate;
    private Boolean tactile;

    //constructores

    public Laptop() {
    }

    public Laptop(Long id, String brand, String model, Integer ram, Double screenSize, LocalDate releaseDate, Boolean tactile) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.screenSize = screenSize;
        this.releaseDate = releaseDate;
        this.tactile = tactile;
    }
    //getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getTactile() {
        return tactile;
    }

    public void setTactile(Boolean tactile) {
        this.tactile = tactile;
    }

    //toString

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", releaseDate=" + releaseDate +
                ", tactile=" + tactile +
                '}';
    }
}
