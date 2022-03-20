
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
public class Localidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long Id;
    private String nombre;
    
    public Localidad() {
    
}
    public Localidad (String nombre){
        this.nombre = nombre;
    }
}
