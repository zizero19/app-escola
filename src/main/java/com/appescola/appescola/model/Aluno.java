package com.appescola.appescola.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date dataNasc;
    private String genero;
    private String endereco;
    private String email;
    private String numTelefone;
    private String numTelefoneResponsavel;

    @OneToMany(mappedBy = "aluno")
    private List<Nota> notas;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Turma turma;
}
