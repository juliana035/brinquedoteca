package com.julianacruz.projetointegrador.controller;

import com.julianacruz.projetointegrador.model.BrinquedoModel;
import com.julianacruz.projetointegrador.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<BrinquedoModel> listar() {
        return brinquedoService.listarTodos();
    }

    @PostMapping
    public BrinquedoModel criar(@RequestBody BrinquedoModel brinquedo) {
        return brinquedoService.salvar(brinquedo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        brinquedoService.deletar(id);
    }
}