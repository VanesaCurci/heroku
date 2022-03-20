
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Provincia;
import java.util.List;


public interface IProvinciaService {
   public List<Provincia> getProvincias();
   public void saveProvincia (Provincia provi);
   public void deleteProvincia (Long id);
   public Provincia findProvincia(Long id);
}
