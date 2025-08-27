package com.example.project.bee1040;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SomadorTests {

	@Test
	@DisplayName("10 + 9 = 19")
	void addsTenAndNine() {
		Somador somador = new Somador();
		assertEquals(19, somador.somar(10, 9), "10 + 9 should equal 19");
	}

	@Test
	@DisplayName("-10 + 4 = -6")
	void addsMinusTenAndFour() {
		Somador somador = new Somador();
		assertEquals(-6, somador.somar(-10, 4), "-10 + 4 should equal -6");
	}	

	@Test
	@DisplayName("15 + -7 = 8")
	void addsFifteenAndMinusSeven() {
		Somador somador = new Somador();
		assertEquals(8, somador.somar(15, -7), "15 + -7 should equal 8");
	}		
}