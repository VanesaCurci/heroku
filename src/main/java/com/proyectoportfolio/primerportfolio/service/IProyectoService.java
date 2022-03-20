
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
   public List<Proyecto> getProyectos();
   public void saveProyecto(Proyecto proye);
   public void deleteProyecto (Long id);
   public Proyecto findProyecto(Long id);
}

