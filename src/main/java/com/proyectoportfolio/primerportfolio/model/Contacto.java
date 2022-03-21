
package com.proyectoportfolio.primerportfolio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


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
    
   @JoinColumn(name = "id_persona")
   @OneToOne(fetch = FetchType.LAZY)
   private Persona persona;

    
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
