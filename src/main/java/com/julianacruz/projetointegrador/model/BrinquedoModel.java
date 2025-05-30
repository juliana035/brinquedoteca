package com.julianacruz.projetointegrador.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class BrinquedoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @ManyToMany(mappedBy = "brinquedos")
    private Set<CriancaModel> criancas = new HashSet<>();
}

