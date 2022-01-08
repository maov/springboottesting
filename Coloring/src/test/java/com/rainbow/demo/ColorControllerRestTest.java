package com.rainbow.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rainbow.demo.controller.ColorController;
import com.rainbow.demo.model.PaintBrush;
import com.rainbow.demo.service.IColorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ColorControllerRestTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;


	@Test
	void returns_200() {

	}

	@Test
	void returns200() throws Exception{

		PaintBrush brush = new PaintBrush("Orange", "123");
		mockMvc.perform(post("/paint").content(
				objectMapper.writeValueAsString(brush)
		).contentType("application/json")
		).andExpect(status().isOk());

		var result = mockMvc.perform(get("/colors")).
				andExpect(status().isOk()).
				andReturn().getResponse().getContentAsString();

		System.out.println(result);



	}

}
