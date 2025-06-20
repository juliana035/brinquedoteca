package com.julianacruz.projetointegrador.service;

import com.julianacruz.projetointegrador.model.BrinquedoModel;
import com.julianacruz.projetointegrador.model.CriancaModel;
import com.julianacruz.projetointegrador.model.CriancaModel;
import com.julianacruz.projetointegrador.repository.CriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriancaService {

    @Autowired
    private CriancaRepository criancaRepository;

    public List<CriancaModel> listarTodos() {
        return criancaRepository.findAll();
    }

    public CriancaModel salvar(CriancaModel crianca) {
        CriancaModel criancadoModel = new CriancaModel();
        criancadoModel.setNome(crianca.getNome());
        criancadoModel.setIdade(crianca.getIdade());
        //BrinquedoModel = new BrinquedoModel();
        criancadoModel.setBrinquedos(crianca.getBrinquedos());
        return criancaRepository.save(crianca);
    }

    public void deletar(Long id) {
        criancaRepository.deleteById(id);
    }
}
