
package com.proyectoportfolio.primerportfolio.controller;

import com.proyectoportfolio.primerportfolio.model.Tecnología;
import com.proyectoportfolio.primerportfolio.service.ITecnologíaServicio;



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


public class TecnologíaController {
    @Autowired
    private ITecnologíaServicio interTecnología;
    
    @GetMapping("/tecnologías")
    public List<Tecnología> getTecnologías(){
        return interTecnología.getTecnologías();
    }
    
    @PostMapping ("/agregar/tecnologías")
    public String createTecnología (@RequestBody Tecnología tecno){
        interTecnología.saveTecnología(tecno);
        return "La tecnología fue creada correctamente";
    }
    
    @DeleteMapping ("/tecnologías/borrar/{id}")
    public String deleteTecnología (@PathVariable Long id){
        interTecnología.deleteTecnología(id);
        return "La tecnología fue eliminada correctamente";
    }
    
    @PutMapping ("tecnologías/editar/{id}")
    public Tecnología editTecnología (@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam ("imagen") String nuevoImagen){
        
        Tecnología tecno = interTecnología.findTecnología(id);
        tecno.setNombre(nuevoNombre);
        tecno.setImagen(nuevoImagen);
        
        
        interTecnología.saveTecnología(tecno);
        return tecno;
    }
}
