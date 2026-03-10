package ar.edu.itec.repository;

import ar.edu.itec.model.ComisionMateria;

public interface ComisionMateriaRepository extends CRUDRepository<ComisionMateria>{
    ComisionMateria findByCode (String codigoComision);
}
