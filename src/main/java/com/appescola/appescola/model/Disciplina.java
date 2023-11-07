package com.appescola.appescola.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @ManyToMany(mappedBy = "disciplinasTurma")
    @JoinTable(name = "disciplina_turma", joinColumns = @JoinColumn(name = "disciplina_id"), inverseJoinColumns = @JoinColumn(name = "turma_id"))
    private List<Turma> turmas;

    @ManyToMany(mappedBy = "disciplinasProfessor")
    @JoinTable(name = "disciplina_professor", joinColumns = @JoinColumn(name = "disciplina_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Professor> professores;

}
