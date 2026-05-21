package com.zoogest.domain.service;

import com.zoogest.domain.model.Especie;
import com.zoogest.domain.model.NombreCientifico;


public interface RegistroEspecieService {
    Especie registrarEspecie(
            NombreCientifico nombreCientifico,
            String nombreEspañol,
            String descripcion
    );
}
    
