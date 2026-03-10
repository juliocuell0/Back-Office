package ar.edu.itec.repository;

import ar.edu.itec.model.Cuatrimestre;

public interface CuatrimestreRepository extends CRUDRepository<Cuatrimestre> {
    Cuatrimestre findByNumber(String numeroCuatrimestre);
}
