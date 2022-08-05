package com.example.crudrepaso;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pruebascontroller")
public class Controller {
    private final IService iService;

    public Controller (IService iService){
        this.iService = iService;
    }

    @PostMapping("/post")
    public DTO ingresarDatoFront(@RequestBody DTO dto){
        return this.iService.crearEntity(dto);
    }

    @GetMapping("/hallarNombres/{id}")
    public DTO buscarNombres(@PathVariable Long id){
        return this.iService.listarNombres(id);
    }

    @GetMapping("/hacerListaNombres/{num}")
    public List<DTO> sacarListaNombres(@PathVariable Long num){
        return this.iService.hacerListas(num);
    }

    @GetMapping("/pruebaQuery/{num1}&{num2}:{id}")
    public List<DTO> pruebaQuery(@PathVariable int num1,
                                 @PathVariable int num2,
                                 @PathVariable Long id){
        return this.iService.queryBetween(id, num1, num2);
    }
}
