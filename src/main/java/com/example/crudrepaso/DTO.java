package com.example.crudrepaso;


import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class DTO {
    private Long id;
    private  String name;
    private Long number;
    private int num;
    private String skill;
}
