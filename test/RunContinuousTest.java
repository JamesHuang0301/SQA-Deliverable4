package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import slowlife.MainPanel;

import static org.junit.Assert.assertEquals;

public class RunContinuousTest {

	private static MainPanel panel;

	@Before
	public void NewMP() {

		panel = new MainPanel(15);
	}

	/**
	 * Tests the panel size is 15
	 */
	@Test
	public void testSize() {

		Assert.assertEquals(panel.getCellsSize(), 15);
	}

	/**
	 * Tests the initial _r is 1000
	 */
	@Test
	public void testInitialR() {

		int R = panel._r;

		assertEquals(R, 1000);
	}
}