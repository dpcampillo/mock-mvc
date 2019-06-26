package com.developer.invest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.invest.domain.InstitucionDTO;
import com.developer.invest.service.InstitucionService;

@RestController
@RequestMapping("/apiv1/instituciones")
public class InstitucionController {

	@Autowired
	private InstitucionService institucionService;

	@PostMapping
	public InstitucionDTO guardar(@RequestBody InstitucionDTO institucionDTO) {
		return institucionService.guardar(institucionDTO);
	}

	@GetMapping
	public List<InstitucionDTO> listar() {
		return institucionService.listar();
	}

}
