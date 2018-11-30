package com.felicidade.sistema.controller;

import java.util.List;

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

import com.felicidade.sistema.entity.Entrada;
import com.felicidade.sistema.entity.Transportadora;
import com.felicidade.sistema.response.Response;
import com.felicidade.sistema.service.EntradaService;
import com.felicidade.sistema.service.TransportadoraService;
import com.felicidade.sistema.utils.Utils;

@RestController
@RequestMapping("/estoque/entrada")
@CrossOrigin(origins = "*") /** Permite acesso de qualquer dispositivo a esse endpoint */
public class EntradaController implements IBaseController {

	@Autowired
	private EntradaService EntradaService;

	

	@GetMapping(value = "{jqpl}/{vars}")
	public ResponseEntity<Response<List<Entrada>>> GetAllEntrada(@PathVariable("jpql")String jpql,@PathVariable("vars")Object...vars) {

		Response<List<Entrada>> response = new Response<List<Entrada>>();
		List<Entrada> transportadoras = EntradaService.findAll(jpql, vars);
	
		response.setData(transportadoras);
		return ResponseEntity.ok(response);
	}
}
