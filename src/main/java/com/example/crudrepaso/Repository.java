package com.example.crudrepaso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Long> {
    Entity findEntityById(Long id);

    List<Entity> findEntityByNumber(Long num);

    @Query("SELECT t FROM Entity t WHERE t.number=:id AND t.num BETWEEN :parameter1 AND :parameter2")
    List<Entity> buscarPorQuery(@Param("id") Long id , @Param("parameter1") int n, @Param("parameter2") int m);
}
