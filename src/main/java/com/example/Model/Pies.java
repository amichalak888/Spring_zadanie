package com.example.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class Pies {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private int wiek;
    private String imie;

}
