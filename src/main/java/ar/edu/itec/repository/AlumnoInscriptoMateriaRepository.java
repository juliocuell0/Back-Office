package ar.edu.itec.repository;

import ar.edu.itec.model.AlumnoInscriptoMateria;

public interface AlumnoInscriptoMateriaRepository extends CRUDRepository<AlumnoInscriptoMateria> {
    AlumnoInscriptoMateria findByDni (String dni);
}
