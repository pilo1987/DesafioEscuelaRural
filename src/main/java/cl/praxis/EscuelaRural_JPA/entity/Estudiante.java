package cl.praxis.EscuelaRural_JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estudiante")
    private int idEstudiante;
    @Column(name="nombre_estudiante")
    private String nombreEstudiante;
    @Column(name="apellido_estudiante")
    private String apellidoEstudiante;
    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Estudiante(Curso curso) {
        this.curso = curso;
    }

}
