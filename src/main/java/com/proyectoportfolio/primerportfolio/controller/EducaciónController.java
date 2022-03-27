
package com.proyectoportfolio.primerportfolio.controller;

import com.proyectoportfolio.primerportfolio.model.Educación;
import com.proyectoportfolio.primerportfolio.service.IEducaciónService;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class EducaciónController {
    @Autowired
    private IEducaciónService interEducación;
    
    @GetMapping("/educación")
    public List<Educación> getEducaciones(){
        return interEducación.getEducaciones();
    }
    
    @GetMapping("/educación/{id}")
    public Educación findEducación(@PathVariable Long id){
        Educación edu = interEducación.findEducación(id);
        return edu;
    }
    
    @PostMapping ("/educación")
    public String createEducación (@RequestBody Educación edu){
        interEducación.saveEducación(edu);
        return "Educación fue creada correctamente";
    }
    
    @DeleteMapping ("/educación/{id}")
    public String deleteEducación (@PathVariable Long id){
        interEducación.deleteEducación(id);
        return "Educación fue eliminada correctamente";
    }
    
    @PutMapping ("educación/{id}")
    public Educación editEducación (@PathVariable Long id,
                                @RequestParam("titulo") String nuevoTitulo,
                                @RequestParam ("lugar") String nuevoLugar,
                                @RequestParam ("duracion") String nuevoDuracion){
        
        Educación edu = interEducación.findEducación(id);
        edu.setTitulo(nuevoTitulo);
        edu.setLugar(nuevoLugar);
        edu.setDuracion(nuevoDuracion);
        
        
        interEducación.saveEducación(edu);
        return edu;
    }
}

