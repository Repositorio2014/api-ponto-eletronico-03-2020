package com.aplication.pontointeligente.api.services;

import java.util.Optional;

import com.aplication.pontointeligente.api.entity.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma Empresa dado um CNPJ
	 * 
	 * @param CNPJ
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCNPJ(String cnpj);
	
	/**
	 * Cadastra uma nova Empresa na base de dados
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
	
}
