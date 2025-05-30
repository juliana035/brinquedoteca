package com.julianacruz.projetointegrador.controller;

import com.julianacruz.projetointegrador.model.CriancaModel;
import com.julianacruz.projetointegrador.model.CriancaModel;
import com.julianacruz.projetointegrador.service.CriancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criancas")
public class CriancaController {

    @Autowired
    private CriancaService criancaService;

    @GetMapping
    public List<CriancaModel> listar() {
        return criancaService.listarTodos();
    }

    @PostMapping
    public CriancaModel criar(@RequestBody CriancaModel crianca) {
        return criancaService.salvar(crianca);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        criancaService.deletar(id);
    }
}
