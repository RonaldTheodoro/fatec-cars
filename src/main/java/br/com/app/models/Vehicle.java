package br.com.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name="vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_vehicle")
    private Long id;
    
    @NotBlank
    @Column(name="brand_vehicle")
    private String brand;
    
    @NotBlank
    @Column(name="model_vehicle")
    private String model;
    
    @Column(name="year_vehicle")
    private int year;
    
    @NotBlank
    @Column(name="category_vehicle")
    private String category;
    
    @NotBlank
    @Column(name="color_vehicle")
    private String color;
    
    @DecimalMin("0")
    @Column(name="price_vehicle")
    private Double price;

    public Vehicle() { }

    public Vehicle(
            String brand,
            String model,
            int year,
            String category,
            String color,
            Double price) {
        
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.category = category;
        this.color = color;
        this.price = price;
    }

    public Vehicle(
            Long id,
            String brand,
            String model,
            int year,
            String category,
            String color,
            Double price) {
        
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.category = category;
        this.color = color;
        this.price = price;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
