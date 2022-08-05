package com.example.crudrepaso;


import java.util.List;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    DTO entityToDTO (Entity entity);
    Entity DTOToEntity (DTO dto);

    List<DTO> listEntityToListDTO (List<Entity> entities);
    List<Entity> listDTOToListEntity (List<DTO> dtos);
}
