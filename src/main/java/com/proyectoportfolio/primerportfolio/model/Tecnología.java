
package com.proyectoportfolio.primerportfolio.model;



import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    
    
    public Tecnología() {
    
}
    public Tecnología (String nombre,String imagen){
        this.nombre = nombre;
        this.imagen = imagen;             
    }  
}


