package ar.edu.itec.repository;

import ar.edu.itec.model.PlanEstudio;

public interface PlanEstudioRepository extends CRUDRepository<PlanEstudio> {
    PlanEstudio findByName(String nombre);
}
