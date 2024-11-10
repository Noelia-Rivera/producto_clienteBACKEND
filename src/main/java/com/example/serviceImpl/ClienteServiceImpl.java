package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ClienteDao;
import com.example.entity.Cliente;
import com.example.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteDao dao;
	
	@Override
	public Cliente create(Cliente ci) {
		// TODO Auto-generated method stub
		return dao.create(ci);
	}

	@Override
	public Cliente update(Cliente ci) {
		// TODO Auto-generated method stub
		return dao.update(ci);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
