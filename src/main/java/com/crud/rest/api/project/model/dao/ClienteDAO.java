package com.crud.rest.api.project.model.dao;

import com.crud.rest.api.project.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
}
