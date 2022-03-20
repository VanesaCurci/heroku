
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Idioma;
import java.util.List;


public interface IIdiomaService {
   public List<Idioma> getIdiomas();
   public void saveIdioma (Idioma idi);
   public void deleteIdioma(Long id);
   public Idioma findIdioma(Long id);
}
