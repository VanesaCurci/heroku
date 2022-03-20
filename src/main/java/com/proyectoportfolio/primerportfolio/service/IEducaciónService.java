
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Educación;
import java.util.List;


public interface IEducaciónService {
    public List<Educación> getEducación();
    public void saveEducación(Educación edu);
    public void deleteEducación (Long id);
    public Educación findEducación(Long id);
}
