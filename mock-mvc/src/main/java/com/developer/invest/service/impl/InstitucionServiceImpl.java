package com.developer.invest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.developer.invest.domain.InstitucionDTO;
import com.developer.invest.service.InstitucionService;

@Service
public class InstitucionServiceImpl implements InstitucionService {

	private List<InstitucionDTO> instituciones = new ArrayList<>();

	@Override
	public InstitucionDTO guardar(InstitucionDTO institucionDTO) {
		instituciones.add(institucionDTO);
		return institucionDTO;
	}

	@Override
	public List<InstitucionDTO> listar() {
		return instituciones.stream().collect(Collectors.toList());
	}

}
