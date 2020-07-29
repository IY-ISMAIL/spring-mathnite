package br.com.mathnite.spring.controller;

import br.com.mathnite.spring.dto.TurmaDto;
import br.com.mathnite.spring.model.Turma;
import br.com.mathnite.spring.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/turma")
@RestController
public class TurmaController {
    private final TurmaService turmaService;

    @Autowired
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @GetMapping
    public List<TurmaDto> list() {
        return turmaService.findAll();
    }

    @PostMapping
    public ResponseEntity<Turma> save(@RequestBody Turma turma) {
        return ResponseEntity.ok(turmaService.save(turma));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Turma>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(turmaService.findOne(id));
    }

    @Transactional
    @PutMapping("/{id}")
    public ResponseEntity<Turma> update(@RequestBody Turma turma) {
        return ResponseEntity.ok(turmaService.update(turma));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        turmaService.delete(id);
        return ResponseEntity.ok(null);
    }
}
