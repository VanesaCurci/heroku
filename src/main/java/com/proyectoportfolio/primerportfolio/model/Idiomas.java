
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
public class Idiomas implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Long nivel;
    
    public Idiomas() {
    
}
    public Idiomas (String nombre, Long nivel){
        this.nombre = nombre;
        this.nivel = nivel;   
    }
}
