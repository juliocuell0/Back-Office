package ar.edu.itec.repository;

import ar.edu.itec.model.Modulo;

public interface ModuloRepository extends CRUDRepository<Modulo>{
    Modulo findByCode (String codigoModulo);
}
