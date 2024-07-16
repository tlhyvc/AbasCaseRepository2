package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Getter
@Setter// exclude id from toString output for better readability.
public class Siparis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int siparisNo;
    private int malNumarasi;
    private int miktar;
    private double birimFiyat;

    public Siparis() {
    }

    public Siparis(int siparisNo, int malNumarasi, int miktar, double birimFiyat) {
        this.siparisNo = siparisNo;
        this.malNumarasi = malNumarasi;
        this.miktar = miktar;
        this.birimFiyat = birimFiyat;
    }
}
