package ar.edu.itec.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ComisionMateria {
    private String codigo; //AnMat1Com1
    private Carrera carrera;
    private Materia materia;
    private Cuatrimestre cuatrimestre;
    private Profesor profesor;
    private List<AlumnoInscriptoMateria> alumnoInscriptos;
    private List<Examen>  examenes;
    private List<Asistencia> asistencias;
    private List<Horario>  horarios;
    private boolean activo;

    public ComisionMateria(String codigo, Carrera carrera, Materia materia, Cuatrimestre cuatrimestre, Profesor profesor, List<AlumnoInscriptoMateria> alumnoInscriptos, List<Examen> examenes, List<Asistencia> asistencias, List<Horario> horarios) {
        this.codigo = codigo;
        this.carrera = carrera;
        this.materia = materia;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
        this.alumnoInscriptos = alumnoInscriptos;
        this.examenes = examenes;
        this.asistencias = asistencias;
        this.horarios = horarios;
        this.activo = true;
    }
}

