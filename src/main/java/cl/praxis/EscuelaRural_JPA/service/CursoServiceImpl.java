package cl.praxis.EscuelaRural_JPA.service;

import cl.praxis.EscuelaRural_JPA.entity.Curso;
import cl.praxis.EscuelaRural_JPA.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Curso> findAll() {
        return repository.findAll();
    }

    @Override
    public Curso findOne(int idCurso) {
        return repository.findById(idCurso).orElse(null);
    }

    @Override
    public boolean create(Curso sj) {
        Curso curso = repository.save(sj);
        System.out.println("creado el id ");
        return curso != null;
    }

    @Override
    public boolean update(Curso sj) {
        Curso curso = repository.save(sj);
        return curso != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}
