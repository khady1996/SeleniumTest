package eu.ensup.navigationensup.presentation.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class NavigationTest {

	Navigation nav = new Navigation();

	@Test
	public void testOpenEnsup() {
		//On v�rifie que le titre correspond � "Google"
		assertEquals(nav.openJavadoc(), "Google");
	}

}
