package ar.edu.itec.repository;

import ar.edu.itec.model.Alumno;

public interface AlumnoRepository extends CRUDRepository<Alumno> {
    Alumno findByDni(String dni);
}
