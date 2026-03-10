package ar.edu.itec.repository;

import ar.edu.itec.model.Carrera;

public interface CarreraRepository extends CRUDRepository<Carrera> {
    Carrera findByName(String nombre);
}
