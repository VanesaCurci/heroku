
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Localidad;
import java.util.List;


public interface ILocalidadService {
    public List<Localidad> getLocalidades();
    public void saveLocalidad (Localidad loca);
    public void deleteLocalidad (Long id);
    public Localidad findLocalidad (Long id);
     
}
