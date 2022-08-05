package com.example.crudrepaso;

import java.util.List;

public interface IService {
    DTO crearEntity (DTO dto);

    DTO listarNombres (Long id);

    List<DTO> hacerListas (Long num);

    List<DTO> queryBetween (Long id, int num1, int num2);
}
