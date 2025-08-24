package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "Customerr")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;


    // Getters and Setters
}