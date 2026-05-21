package com.zoogest.domain.service;

import com.zoogest.domain.model.Especie;
import com.zoogest.domain.model.EspecieId;
import com.zoogest.domain.model.NombreCientifico;
import com.zoogest.domain.service.RegistroEspecieService;

public class RegistroEspecieServiceImpl implements RegistroEspecieService {

    @Override
    public Especie registrarEspecie(
            NombreCientifico nombreCientifico,
            String nombreEspañol,
            String descripcion) {

        // Validaciones de dominio
        if (nombreCientifico == null) {
            throw new IllegalArgumentException("El nombre científico es obligatorio");
        }

        if (nombreEspañol == null || nombreEspañol.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre en español es obligatorio");
        }

        EspecieId id = EspecieId.generar();

        Especie especie = Especie.crear(id, nombreCientifico, nombreEspañol);
        
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            especie.actualizarDescripcion(descripcion);
        }

        return especie;
    }
}