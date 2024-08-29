package cl.praxis.EscuelaRural_JPA.repository;

import cl.praxis.EscuelaRural_JPA.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
