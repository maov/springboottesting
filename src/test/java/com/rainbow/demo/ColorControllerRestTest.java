package com.rainbow.demo;

import com.rainbow.demo.controller.ColorController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = ColorController.class)
class ColorControllerRestTest {

	@Test
	void returns_200() {
	}

	@Test
	void returns400(){

	}

}
