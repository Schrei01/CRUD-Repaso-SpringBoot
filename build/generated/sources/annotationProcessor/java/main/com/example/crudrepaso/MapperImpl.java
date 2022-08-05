package com.example.crudrepaso;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T16:13:44-0500",
    comments = "version: 1.5.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class MapperImpl implements Mapper {

    @Override
    public DTO entityToDTO(Entity entity) {
        if ( entity == null ) {
            return null;
        }

        DTO dTO = new DTO();

        dTO.setId( entity.getId() );
        dTO.setName( entity.getName() );
        dTO.setNumber( entity.getNumber() );
        dTO.setNum( entity.getNum() );

        return dTO;
    }

    @Override
    public Entity DTOToEntity(DTO dto) {
        if ( dto == null ) {
            return null;
        }

        Entity entity = new Entity();

        entity.setId( dto.getId() );
        entity.setName( dto.getName() );
        entity.setNumber( dto.getNumber() );
        entity.setNum( dto.getNum() );

        return entity;
    }

    @Override
    public List<DTO> listEntityToListDTO(List<Entity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DTO> list = new ArrayList<DTO>( entities.size() );
        for ( Entity entity : entities ) {
            list.add( entityToDTO( entity ) );
        }

        return list;
    }

    @Override
    public List<Entity> listDTOToListEntity(List<DTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Entity> list = new ArrayList<Entity>( dtos.size() );
        for ( DTO dTO : dtos ) {
            list.add( DTOToEntity( dTO ) );
        }

        return list;
    }
}
