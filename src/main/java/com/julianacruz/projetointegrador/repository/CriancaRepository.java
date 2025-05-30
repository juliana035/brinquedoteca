package com.julianacruz.projetointegrador.repository;

import com.julianacruz.projetointegrador.model.CriancaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriancaRepository extends JpaRepository<CriancaModel, Long> {}
