package com.example.tarea;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tarea.H2.h2api.H2ApiApplication;

@SpringBootTest
class TareaApplicationTests {
	
	public static void main(String[] args) {
		SpringApplication.run(H2ApiApplication.class, args);
	}

	@Test
	void contextLoads() {
	}

}
