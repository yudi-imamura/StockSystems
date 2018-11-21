package com.felicidade.sistema.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felicidade.sistema.entity.Entrada;
import com.felicidade.sistema.response.Response;
import com.felicidade.sistema.service.EntradaService;

@RestController
@RequestMapping("/estoque/entrada")
@CrossOrigin(origins="*") /**Permite acesso de qualquer dispositivo a esse endpoint*/
public class EntradaController {

	@Autowired
	private EntradaService entradaService;

	@PostMapping
	public ResponseEntity<Response<Entrada>> RegisterEntrada(HttpServletRequest request,
			@RequestBody Entrada entrada_detalhes, BindingResult result ){
		Response<Entrada> response = new Response<Entrada>();
		try {
		if(result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		entradaService.save(entrada_detalhes); 
		response.setData(entrada_detalhes);
		}catch(Exception e) {
			response.getErrors().add(e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
		return ResponseEntity.ok(response);
	}
	
	@PutMapping
	public ResponseEntity<Response<Entrada>> UpdateEntrada(HttpServletRequest request,
			@RequestBody Entrada entrada_detalhes, BindingResult result ){
	
		Response<Entrada> response = new Response<Entrada>();
		try {
			if(result.hasErrors()) {
				result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
				return ResponseEntity.badRequest().body(response);
			}
			entradaService.update(entrada_detalhes);
			response.setData(entrada_detalhes);
		}catch(Exception e) {
			response.getErrors().add(e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
		return ResponseEntity.ok(response);
	}

	@GetMapping(value="{id}")	
	public ResponseEntity<Response<Entrada>> GetByEntrada( @PathVariable("id") long id){
	
		Response<Entrada> response = new Response<Entrada>();
			Entrada entrada = entradaService.buscarPorId(id);
			if(entrada == null) {
				response.getErrors().add("Nenhum registro de entrada encontrado com o id: "+id);
				return ResponseEntity.badRequest().body(response);				
			}
			response.setData(entrada);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value="{pages}/{count}")	
	public ResponseEntity<Response<Page<Entrada>>> GetAllEntradas( @PathVariable("pages") int pages, @PathVariable("count") int count){
	
		Response<Page<Entrada>> response = new Response<Page<Entrada>>();
			Page<Entrada> entrada = entradaService.findAll(pages, count);
			response.setData(entrada);
		return ResponseEntity.ok(response);
	}

}
