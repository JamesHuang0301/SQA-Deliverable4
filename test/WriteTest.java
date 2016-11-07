package test;

import org.junit.Test;
import slowlife.Cell;

import static org.junit.Assert.assertEquals;

public class WriteTest {

	/**
	 * Test cell changed from dead to alive returns "X", which means alive
	 */
	@Test
	public void testalive1() {
		
		Cell newcell = new Cell(false);
		newcell.setAlive(true);
		String state = newcell.toString();
		
		assertEquals(state, "X");
	}
	
	
	/**
	 * Test cell changed from alive to dead returns ".", which means dead
	 */
	@Test
	public void testdead1() {
		
		Cell newcell = new Cell(true);
		newcell.setAlive(false);
		String state = newcell.toString();
		
		assertEquals(state, ".");
	}

	/**
	 * Test cell with the parameter true returns "X", which means alive
	 */
	@Test
	public void testalive2() {

		Cell newcell = new Cell(true);
		String state = newcell.toString();

		assertEquals(state, "X");
	}


	/**
	 * Test cell with the parameter false returns ".", which means dead
	 */
	@Test
	public void testdead2() {

		Cell newcell = new Cell();
		String state = newcell.toString();

		assertEquals(state, ".");
	}

}
