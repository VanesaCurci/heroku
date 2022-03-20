
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
public class Proyecto implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  private Long id;
  private String título;
  private String descripción;
  
  public Proyecto() {
    
}
  public Proyecto(String título, String descripción){
      this.título = título;
      this.descripción = descripción;
  }
  
}