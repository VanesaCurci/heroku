
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
public class Contacto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String mail;
    private String facebook;
    private int whatsapp;
    private String twitter;
    private String linkedIn;
    private String instagram;
    
    public Contacto() {
    
}
    public Contacto(String mail, String facebook, int whatsapp, 
                    String twitter, String linkedIn, String instagram){
        this.mail = mail;
        this.facebook = facebook;
        this.whatsapp = whatsapp;
        this.twitter = twitter;
        this.linkedIn = linkedIn;
        this.instagram = instagram;
    }
}
