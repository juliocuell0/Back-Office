package ar.edu.itec.repository;

import ar.edu.itec.model.Horario;

public interface HorarioRepository extends CRUDRepository<Horario> {
    Horario findById (String id);
    // Faltan los Modulos
}
