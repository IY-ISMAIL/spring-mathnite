package br.com.mathnite.spring.repository;

import br.com.mathnite.spring.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
