
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Contacto;
import java.util.List;


public interface IContactoService {
    public List<Contacto> getContactos();
    public void saveContacto (Contacto conta);
    public void deleteContacto (Long id);
    public Contacto findContacto(Long id);
}
