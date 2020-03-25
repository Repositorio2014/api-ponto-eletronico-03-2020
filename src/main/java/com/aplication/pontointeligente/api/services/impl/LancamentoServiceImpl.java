package com.aplication.pontointeligente.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.aplication.pontointeligente.api.entity.Lancamento;
import com.aplication.pontointeligente.api.repositories.LancamentoRepository;
import com.aplication.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService{

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);

	@Autowired
	LancamentoRepository lancamentoRepository;
	
	@Override
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("Buscando lancçamentos para o funcionário de ID {}", funcionarioId);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscarPorId(Long lancamentoId) {
		log.info("Buscando Lançamnento por ID {}", lancamentoId);
		return this.lancamentoRepository.findById(lancamentoId);
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistinso o lançamento {}", lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long lancamentoId) {
		log.info("Removendo o lancamento ID {}", lancamentoId);
		this.lancamentoRepository.deleteById(lancamentoId);
	} 
	

}
