
package com.proyectoportfolio.primerportfolio.service;


import com.proyectoportfolio.primerportfolio.model.Tecnología;
import java.util.List;


public interface ITecnologíaServicio {
    public List<Tecnología> getTecnologías ();
    public void saveTecnología (Tecnología tecno);
    public void deleteTecnología (Long id);
    public Tecnología findTecnología (Long id);
}
