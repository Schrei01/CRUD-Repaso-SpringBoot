package com.example.crudrepaso;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements IService{
    private final Repository repository;
    private final Mapper mapper;

    public Service(Repository repository,
                   Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DTO crearEntity(DTO dto){
        Entity entity = this.mapper.DTOToEntity(dto);
        return this.mapper.entityToDTO(this.repository.save(entity));
    }

    @Override
    public DTO listarNombres(Long id) {
        return this.mapper.entityToDTO(this.repository.findEntityById(id));
    }

    @Override
    public List<DTO> hacerListas(Long num) {
        return this.mapper.listEntityToListDTO(this.repository.findEntityByNumber(num));
    }

    @Override
    public List<DTO> queryBetween(Long id, int num1, int num2) {
        return this.mapper.listEntityToListDTO(this.repository.buscarPorQuery(id, num1, num2));
    }


}
