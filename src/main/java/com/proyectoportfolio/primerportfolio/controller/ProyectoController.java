
package com.proyectoportfolio.primerportfolio.controller;

import com.proyectoportfolio.primerportfolio.model.Proyecto;
import com.proyectoportfolio.primerportfolio.service.IProyectoService;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class ProyectoController {
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping("/proyectos")
    public List<Proyecto> getProyectos(){
        return interProyecto.getProyectos();
    }
    
    @PostMapping ("/agregar/proyectos")
    public String createProyecto (@RequestBody Proyecto proye){
        interProyecto.saveProyecto(proye);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public String deleteProyecto (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping ("proyectos/editar/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                @RequestParam("título") String nuevoTítulo,
                                @RequestParam ("descripción") String nuevoDescripción){
        
        Proyecto proye = interProyecto.findProyecto(id);
        proye.setTítulo(nuevoTítulo);
        proye.setDescripción(nuevoDescripción);
        
        
        interProyecto.saveProyecto(proye);
        return proye;
    }
}

