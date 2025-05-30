package com.julianacruz.projetointegrador.service;

import com.julianacruz.projetointegrador.model.BrinquedoModel;
import com.julianacruz.projetointegrador.model.CriancaModel;
import com.julianacruz.projetointegrador.repository.BrinquedoRepository;
import com.julianacruz.projetointegrador.repository.CriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public List<BrinquedoModel> listarTodos() {
        return brinquedoRepository.findAll();
    }

    public BrinquedoModel salvar(BrinquedoModel brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public void deletar(Long id) {
        brinquedoRepository.deleteById(id);
    }
}

