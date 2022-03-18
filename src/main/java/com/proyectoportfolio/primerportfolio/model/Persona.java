
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

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
   
    public Persona() {
    
}
    public Persona (String nombre,String apellido, int edad ){
        
      
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
                
    }
}
