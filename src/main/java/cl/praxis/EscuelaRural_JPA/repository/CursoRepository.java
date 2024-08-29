package cl.praxis.EscuelaRural_JPA.repository;

import cl.praxis.EscuelaRural_JPA.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
