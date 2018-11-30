package com.felicidade.sistema.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felicidade.sistema.entity.Transportadora;
import com.felicidade.sistema.response.Response;
import com.felicidade.sistema.service.TransportadoraService;
import com.felicidade.sistema.utils.Utils;

@RestController
@RequestMapping("/estoque/transportadora")
@CrossOrigin(origins="*")
public class TransportadoraController implements IBaseController {

	@Autowired
	private TransportadoraService transportadoraService;

	@PostMapping
	public ResponseEntity<Response<Transportadora>> RegisterTransportadora(HttpServletRequest request,
			@RequestBody Transportadora transportadora, BindingResult result ){
		Response<Transportadora> response = new Response<Transportadora>();
		try {
		if(result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		transportadoraService.save(transportadora); 
		response.setData(transportadora); 
		}catch(Exception e) {
			response.getErrors().add(e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
		return ResponseEntity.ok(response);
	}
	
	@PutMapping
	public ResponseEntity<Response<Transportadora>> UpdateEntrada(HttpServletRequest request,
			@RequestBody Transportadora transportadora, BindingResult result ){
	
		Response<Transportadora> response = new Response<Transportadora>();
		try {
			Long cnpj = transportadora.getCnpj();
			if (cnpj.toString().length()<15) {
				result.addError(new ObjectError("CNPJ", "CNPJ está no formato inválido, deve conter 15 algarismos!"));
			}
			if(result.hasErrors()) {
				Utils.clearErrors(errors);
				result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
				response.setErrors(errors);
				return ResponseEntity.badRequest().body(response);
			}
			Transportadora transport = transportadoraService.findById(transportadora.getCd_transportadora());
			transport = transportadora;
			transportadoraService.update(transport);
			response.setData(transport);
		}catch(Exception e) {
			errors.add(e.getMessage());
			response.setErrors(errors);
			return ResponseEntity.badRequest().body(response);
		}
		return ResponseEntity.ok(response);
	}

	@GetMapping(value="{id}")	
	public ResponseEntity<Response<Transportadora>> GetByEntrada( @PathVariable("id") Long id){
	
		Response<Transportadora> response = new Response<Transportadora>();
		Transportadora transportadora = transportadoraService.findById(id);
			if(transportadora == null) {
				Utils.clearErrors(errors);
				errors.add("Nenhum registro de transportadora encontrada com o id: "+id);
				response.setErrors(errors);
				return ResponseEntity.badRequest().body(response);				
			}
			response.setData(transportadora);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value="{page}/{count}")	
	public ResponseEntity<Response<Page<Transportadora>>> GetAllEntrada( @PathVariable("page") int page, @PathVariable("count") int count){
	
		Response<Page<Transportadora>> response = new Response<Page<Transportadora>>();
		Page<Transportadora> transportadoras = transportadoraService.findAllwithPagination(page, count);
			if(transportadoras == null) {
				Utils.clearErrors(errors);
				errors.add("Nenhum registro de transportadora encontrado!");
				response.setErrors(errors);
				return ResponseEntity.badRequest().body(response);				
		}
		response.setData(transportadoras);
		return ResponseEntity.ok(response);
	}
}
