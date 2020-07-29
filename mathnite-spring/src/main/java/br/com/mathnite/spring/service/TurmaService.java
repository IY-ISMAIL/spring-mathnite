package br.com.mathnite.spring.service;

import br.com.mathnite.spring.dto.TurmaDto;
import br.com.mathnite.spring.model.Turma;
import br.com.mathnite.spring.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


    @Service
    public class TurmaService {

        private final TurmaRepository turmaRepository;

        @Autowired
        public TurmaService(TurmaRepository turmaRepository){

            this.turmaRepository = turmaRepository;
        }
        public Turma save(Turma turma){

            return turmaRepository.save(turma);
        }

        public List<TurmaDto> findAll() {
            List<Turma> turma = turmaRepository.findAll();
            return turma.stream().map(TurmaDto::new).collect(Collectors.toList());
        }

        public Optional<Turma> findOne(long id) {
            return turmaRepository.findById(id);
        }

        public Turma update(Turma turma) {
            Optional<Turma> optionalTurma = this.findOne(turma.getId());

            if (optionalTurma.isPresent()) {
                return this.save(turma);
            } else {
                return null;
            }
        }
        public void delete(Long id) {
            Optional<Turma> optionalTurma = this.findOne(id);

            if (optionalTurma.isPresent()) {
                turmaRepository.deleteById(id);
            }
        }

    }
