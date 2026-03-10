package ar.edu.itec.repository;

import ar.edu.itec.model.AlumnoInscriptoCarrera;

public interface AlumnoInscriptoCarreraRepository extends CRUDRepository<AlumnoInscriptoCarreraRepository>{
   AlumnoInscriptoCarrera findByDni (String dni);
}
