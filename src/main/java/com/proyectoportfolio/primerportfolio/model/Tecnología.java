
package com.proyectoportfolio.primerportfolio.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;





@Getter @Setter
@Entity


public class Tecnología implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
    
    @ManyToMany(mappedBy = "tecnologías")
    @JsonIgnoreProperties(value="tecnologías")
    private Set<Persona> personas;
    
    public Tecnología() {
    
}
    public Tecnología (String nombre,String imagen){
        this.nombre = nombre;
        this.imagen = imagen;             
    }  
}


