package ar.edu.itec.repository;

import ar.edu.itec.model.Examen;

public interface ExamenRepository extends CRUDRepository<Examen> {
    Examen findById(String idExamen);
}
