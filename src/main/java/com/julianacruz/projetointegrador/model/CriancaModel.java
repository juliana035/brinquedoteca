package com.julianacruz.projetointegrador.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Set<BrinquedoModel> getBrinquedos() {
        return brinquedos;
    }

    public void setBrinquedos(Set<BrinquedoModel> brinquedos) {
        this.brinquedos = brinquedos;
    }
}
