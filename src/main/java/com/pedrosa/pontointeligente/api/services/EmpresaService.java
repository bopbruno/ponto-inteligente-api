package com.pedrosa.pontointeligente.api.services;

import java.util.Optional;

import com.pedrosa.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);
}
