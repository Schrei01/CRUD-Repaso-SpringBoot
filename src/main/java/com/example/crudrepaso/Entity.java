package com.example.crudrepaso;


import lombok.Data;

import javax.persistence.*;

@Data
@javax.persistence.Entity
@Table(name = "PRUEBAS")
public class Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NUMBER1")
    private Long number;
    @Column(name = "NUMBER2")
    private int num;
}
