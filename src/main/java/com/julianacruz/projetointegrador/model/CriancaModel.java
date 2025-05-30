package com.julianacruz.projetointegrador.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class CriancaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;

    @ManyToMany
    @JoinTable(
            name = "crianca_brinquedo",
            joinColumns = @JoinColumn(name = "crianca_id"),
            inverseJoinColumns = @JoinColumn(name = "brinquedo_id")
    )
    private Set<BrinquedoModel> brinquedos = new HashSet<>();
}
