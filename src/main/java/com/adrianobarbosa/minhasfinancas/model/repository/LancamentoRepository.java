package com.adrianobarbosa.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adrianobarbosa.minhasfinancas.model.entity.Lancamento;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
