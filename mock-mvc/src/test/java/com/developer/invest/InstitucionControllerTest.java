package com.developer.invest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.developer.invest.controller.InstitucionController;
import com.developer.invest.service.InstitucionService;

@RunWith(SpringRunner.class)
@WebMvcTest(InstitucionController.class)
public class InstitucionControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private InstitucionService service;

	@Test
	public void testListarInstituciones() throws Exception {
		mockMvc.perform(get("/apiv1/instituciones")).andExpect(status().isOk());
	}

}
