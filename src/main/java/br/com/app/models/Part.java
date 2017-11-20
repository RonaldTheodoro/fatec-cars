package br.com.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name="part")
public class Part {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_part")
    private Long id;
    
    @NotBlank
    @Column(name="name_part")
    private String name;
    
    @NotBlank
    @Column(name="model_part")
    private String model;
    
    @DecimalMin("1")
    @Column(name="price_part")
    private Double price;

    public Part() { }

    public Part(String name, String model, Double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Part(Long id, String name, String model, Double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
