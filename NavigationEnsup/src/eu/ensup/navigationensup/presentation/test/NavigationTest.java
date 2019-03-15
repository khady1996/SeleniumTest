package eu.ensup.navigationensup.presentation.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class NavigationTest {

	Navigation nav = new Navigation();

	@Test
	public void testOpenEnsup() {
		//On vérifie que le titre correspond à "Google"
		assertEquals(nav.openJavadoc(), "Google");
	}

}
