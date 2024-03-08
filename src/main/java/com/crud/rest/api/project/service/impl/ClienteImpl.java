package com.crud.rest.api.project.service.impl;

import com.crud.rest.api.project.model.dao.ClienteDAO;
import com.crud.rest.api.project.model.entity.Cliente;
import com.crud.rest.api.project.service.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {

    @Autowired //Inyeccion de dependencias
    private ClienteDAO _clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return _clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return _clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        _clienteDao.delete(cliente);
    }
}
