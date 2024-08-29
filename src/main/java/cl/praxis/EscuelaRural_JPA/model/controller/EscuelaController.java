package cl.praxis.EscuelaRural_JPA.model.controller;

import cl.praxis.EscuelaRural_JPA.entity.Estudiante;
import cl.praxis.EscuelaRural_JPA.service.CursoService;
import cl.praxis.EscuelaRural_JPA.service.EstudianteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiantes")
public class EscuelaController {
    private final EstudianteService estudianteService;
    private final CursoService cursoService;

    public EscuelaController(EstudianteService estudianteService, CursoService cursoService) {
        this.estudianteService = estudianteService;
        this.cursoService = cursoService;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("estudiantes", estudianteService.findAll());
        return "estudianteList";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model){
        model.addAttribute("estudiante", estudianteService.findOne(id));
        model.addAttribute("curso", cursoService.findAll());
        return "estudianteEdit";
    }

    @PostMapping
    public String update(@ModelAttribute Estudiante estudiante){
        boolean result = estudianteService.update(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/new")
    public String toCreate(Model model){
        model.addAttribute("curso", cursoService.findAll());
        return "estudianteNew";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute Estudiante estudiante){
        boolean result = estudianteService.create(estudiante);
        return "redirect:/estudiantes";
    }
    @GetMapping("/{id}/del")
    public String delete(@PathVariable("id") int id){
        boolean result = estudianteService.delete(id);
        return "redirect:/estudiantes";
    }

}
