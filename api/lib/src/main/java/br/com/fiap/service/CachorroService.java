package br.com.fiap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.dto.CachorroDTO;
import br.com.fiap.repository.CachorroRepository;

public class CachorroService {
	
	private final CachorroRepository caoRepository; 
	
	@Autowired
	public CachorroService(CachorroRepository caoRepository) { 
		
		this.caoRepository = caoRepository; 
		} 
	
	public List<CachorroDTO> getAllCachorro() { 
		return caoRepository.findAll().stream().map(entity -> new CachorroDTO(entity)).toList(); 
		
	} 
	
	public void delete(String nome) { 
		caoRepository.delete(nome); 
		
	} 
	
	public Optional<CachorroDTO> findById(Long id) { 
		
		return caoRepository.findById(id); 
		
	} 
	
	public CachorroDTO save(CachorroDTO dog) { 
		
		return caoRepository.save(dog); 
		
	} 
	
	public List<CachorroDTO> findAll() { 
		
		return caoRepository.findAll(); 
		
	
	} 
	
}


