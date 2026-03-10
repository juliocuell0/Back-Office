package ar.edu.itec.repository;

import ar.edu.itec.model.Profesor;

public interface ProfesorRepository extends CRUDRepository<Profesor>{
    Profesor findByDni(String dni);
}
