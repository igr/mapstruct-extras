package com.oblac.mapstruct.with_not_fluent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WithNotFluentAccessorNamingStrategyTest {

	@Test
	void isWith_true() {
		final var s = new WithNotFluentAccessorNamingStrategy();
		
		assertFalse(s.isWithMethod("setFoo"));
	}

	@Test
	void isWith_false() {
		final var s = new WithNotFluentAccessorNamingStrategy();

		assertTrue(s.isWithMethod("withFoo"));
	}
}