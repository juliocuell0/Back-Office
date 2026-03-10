package ar.edu.itec.repository;

import ar.edu.itec.model.Materia;

public interface MateriaRepository extends CRUDRepository<Materia> {
    Materia findByCode(String codigoMateria);
}
