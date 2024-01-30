package it.unicam.cs.prog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test {

	@Test
	void testPacco() {
		Pacco p = new Pacco(10);
		assertEquals(10, p.getPeso());
	}
	
	@Test
	void testPacco2() {
		boolean flag = false;
		try {
			Pacco p = new Pacco(-5);
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}

	
	@Test
	void testZattera1() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(-1, 10);			
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}

	@Test
	void testZattera2() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(10, -1);			
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}

	@Test
	void testZattera3() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(1, -1);			
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}
	
	
	@Test
	void testZattera4() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);			
			z.aggiungiPacco(null, null);
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}

	@Test
	void testZattera5() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);			
			z.aggiungiPacco(new Pacco(5), null);
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}

	@Test
	void testZattera6() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);			
			z.aggiungiPacco(null, new Punto(5,5));
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}


	@Test
	void testZattera7() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);			
			z.aggiungiPacco(new Pacco(5), new Punto(15,15));
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}

	@Test
	void testZattera8() {
		ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);			
		Punto p = new Punto(5,5);
		z.aggiungiPacco(new Pacco(5), p);
		assertEquals(5, z.getPesoTotale());
		assertEquals(5, z.getPesoMedio());
		Punto b = z.getBaricentro();
		assertEquals(b, p);
	}

	@Test
	void testZattera9() {
		boolean flag = false;
		try {
			ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);
			for(int i=0; i<101; i++) {
				z.aggiungiPacco(new Pacco(5), new Punto(5,5));
			}
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);		
	}


	@Test
	void testZattera10() {
		ZatteraGalleggiante z = new ZatteraGalleggiante(10, 10);			
		z.aggiungiPacco(new Pacco(1), new Punto(2,2));
		z.aggiungiPacco(new Pacco(1), new Punto(2,4));
		z.aggiungiPacco(new Pacco(1), new Punto(4,4));
		z.aggiungiPacco(new Pacco(1), new Punto(4,2));
		Punto b = z.getBaricentro();
		assertEquals(b, new Punto(3,3));
		assertEquals(1, z.getPesoMedio());
		assertEquals(4, z.getPesoTotale());

	}


}
