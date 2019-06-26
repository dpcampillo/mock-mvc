package com.developer.invest.service;

import java.util.List;

import com.developer.invest.domain.InstitucionDTO;

public interface InstitucionService {

	public InstitucionDTO guardar(InstitucionDTO institucionDTO);

	public List<InstitucionDTO> listar();

}
