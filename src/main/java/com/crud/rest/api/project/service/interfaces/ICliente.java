package com.crud.rest.api.project.service.interfaces;

import com.crud.rest.api.project.model.entity.Cliente;

public interface ICliente {
    //No tenemos metodo para update aquí ya que madiante el save, si el id ya existe lo actualizara automaticamente
    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);
}
