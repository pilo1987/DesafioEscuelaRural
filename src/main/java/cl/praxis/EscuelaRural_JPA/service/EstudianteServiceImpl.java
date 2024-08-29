package cl.praxis.EscuelaRural_JPA.service;

import cl.praxis.EscuelaRural_JPA.entity.Estudiante;
import cl.praxis.EscuelaRural_JPA.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    EstudianteRepository estudianteRepository;
    CursoServiceImpl courseService;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository, CursoServiceImpl courseService) {
        this.estudianteRepository = estudianteRepository;
        this.courseService = courseService;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findOne(int id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Estudiante s) {
        Estudiante estudiante = estudianteRepository.save(s);

        return true;
    }

    @Override
    public boolean update(Estudiante u) {
        Estudiante estudiante = estudianteRepository.save(u);
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = estudianteRepository.existsById(id);
        if (exist){
            estudianteRepository.deleteById(id);
        }
        return exist;
    }
}
