package br.org.com.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.com.recode.model.Passagem;

@Repository
public interface PassagemRepository extends JpaRepository <Passagem, Long>{

}
