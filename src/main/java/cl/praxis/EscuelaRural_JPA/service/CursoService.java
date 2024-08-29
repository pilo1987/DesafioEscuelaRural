package cl.praxis.EscuelaRural_JPA.service;

import cl.praxis.EscuelaRural_JPA.entity.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> findAll();

    Curso findOne(int idCurso);
    boolean create(Curso sj);
    boolean update(Curso sj);
    boolean delete(int id);
}
