package com.julianacruz.projetointegrador.repository;

import com.julianacruz.projetointegrador.model.BrinquedoModel;
import com.julianacruz.projetointegrador.model.CriancaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrinquedoRepository extends JpaRepository<BrinquedoModel, Long> {}


