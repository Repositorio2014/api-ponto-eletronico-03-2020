package com.aplication.pontointeligente.api.services;

import java.util.Optional;

import com.aplication.pontointeligente.api.entity.Funcionario;

public interface FuncionarioService {

	/**
	 * Persiste um Funcionario na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionatrio);
	
	/**
	 *Busca e retorna um funcionario dado um CPF
	 *
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna o funcionario dado um email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna um funcionario dado um ID
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
	
}
