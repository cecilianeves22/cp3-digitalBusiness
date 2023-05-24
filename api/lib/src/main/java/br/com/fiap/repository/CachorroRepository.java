package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.dto.CachorroDTO;

public interface CachorroRepository extends JpaRepository<CachorroDTO, Long> {

	void delete(String nome);

}
