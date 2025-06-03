package com.julianacruz.projetointegrador.controller;

import com.julianacruz.projetointegrador.model.BrinquedoModel;
import com.julianacruz.projetointegrador.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
@CrossOrigin(origins = "*")  // ✅ Libera o acesso de qualquer origem (útil para front-end)
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public ResponseEntity<List<BrinquedoModel>> listar() {
        List<BrinquedoModel> brinquedos = brinquedoService.listarTodos();
        return ResponseEntity.ok(brinquedos);
    }

    @PostMapping
    public ResponseEntity<BrinquedoModel> criar(@RequestBody BrinquedoModel brinquedo) {
        BrinquedoModel salvo = brinquedoService.salvar(brinquedo);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        brinquedoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
