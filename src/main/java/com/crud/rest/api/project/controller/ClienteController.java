package com.crud.rest.api.project.controller;

import com.crud.rest.api.project.model.entity.Cliente;
import com.crud.rest.api.project.service.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {
    @Autowired
    private ICliente _clienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return _clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update(@RequestBody Cliente cliente){
        return _clienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public void delete(@PathVariable Integer id){
        Cliente cliente = _clienteService.findById(id);
        _clienteService.delete(cliente);
    }

    @GetMapping("cliente/{id}")
    public Cliente showById(@PathVariable Integer id){
        return _clienteService.findById(id);
    }
}
