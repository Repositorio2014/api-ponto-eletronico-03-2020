package com.aplication.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.aplication.pontointeligente.api.entity.Lancamento;

public interface LancamentoService {
	/**
	 *Retorna uma lista de lançaments de um determinado funcionário
	 *
	 *@param funcionarioId
	 *@param serviceRequest
	 *@return Page<Lancamento>
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	/**
	 *Retorna um Lançamento por Id
	 *
	 *@param id
	 *@return Optional<Lancamento>
	 */
	Optional<Lancamento> buscarPorId(Long lancamentoId);
	
	/**
	 *Persistir um Lançamento na base de dados
	 *
	 *@param lancamento
	 *@return Lancamneto
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 *Remove um lancamento da base de dados
	 *
	 *@param lancamentoId
	 */
	void remover(Long lancamentoId);
}
