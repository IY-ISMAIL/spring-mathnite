package br.com.mathnite.spring.dto;

import br.com.mathnite.spring.model.Turma;

public class TurmaDto {

    private Long id;
    private String turno;
    private Integer ano;

    public TurmaDto (Turma turma){
        this.id = turma.getId();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
    }
    public TurmaDto () {

    }

    public Long getId() {
        return id;
    }

    public String getTurno() {
        return turno;
    }

    public Integer getAno() {
        return ano;
    }
}
