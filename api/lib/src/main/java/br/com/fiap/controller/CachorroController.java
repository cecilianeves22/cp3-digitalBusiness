package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.dto.CachorroDTO;

import br.com.fiap.service.CachorroService;

@RestController
@RequestMapping("/api/cachorro")
@CrossOrigin(origins = "http://localhost:3000")
public class CachorroController {
	
	private final CachorroService dogService;
	
	@Autowired
    public CachorroController(CachorroService dogService) {
        this.dogService = dogService;
    }
		
	@GetMapping("/api/cachorros")
	public List<CachorroDTO> getAllCachorros() { 
		return dogService.findAll(); 
		} 
	
	@PostMapping("/api/cachorrosCreate")
	public CachorroDTO createCachorros(@RequestBody CachorroDTO dog) { 
		return dogService.save(dog); 
		} 
	
	@PutMapping("/api/cachorrosUpdate")
	public ResponseEntity<CachorroDTO> replaceCachorros(@RequestBody CachorroDTO newCachorros) {
		CachorroDTO cachorrosUpdated = dogService.save(newCachorros);
		return ResponseEntity.ofNullable(cachorrosUpdated);
	}
	@DeleteMapping("/api/cachorrosDelete/{nome}") 
	public void delete(@PathVariable String nome) { 
		dogService.delete(nome); 
		}

}
