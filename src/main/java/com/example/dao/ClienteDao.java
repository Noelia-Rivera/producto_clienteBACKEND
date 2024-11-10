package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.entity.Cliente;

public interface ClienteDao {
	Cliente create(Cliente ci);
	Cliente update(Cliente ci);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente> readAll();
}
