package com.example.carservice.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity implements Serializable {
    public static final long serialVersionUID = 1L;

    public CarEntity(String brand, String model, String userId) {
        this.brand = brand;
        this.model = model;
        this.userId = userId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand", nullable = false, length = 60)
    private String brand;

    @Column(name = "model", nullable = false, length = 128)
    private String model;

    @Column(name = "userId", nullable = false)
    private String userId;

}
