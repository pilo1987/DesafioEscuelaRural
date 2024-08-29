package cl.praxis.EscuelaRural_JPA.service;

import cl.praxis.EscuelaRural_JPA.entity.Estudiante;

import java.util.List;

public interface EstudianteService {

    List<Estudiante> findAll();
    Estudiante findOne(int id);
    boolean create(Estudiante s);
    boolean update(Estudiante u);
    boolean delete(int id);
}
