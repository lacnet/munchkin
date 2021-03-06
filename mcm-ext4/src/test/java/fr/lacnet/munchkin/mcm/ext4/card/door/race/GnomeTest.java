package fr.lacnet.munchkin.mcm.ext4.card.door.race;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.lacnet.munchkin.mcm.ext4.card.door.race.GnomeBean;
import fr.lacnet.munchkin.mcm.ext4.card.door.race.Race;

/**
 * 
 * @author jla
 *
 */
public class GnomeTest extends AbstractRaceTest {
	/**
	 * 
	 */
	@Before
	public void setUp() {
		classUnderTest = new GnomeBean("GnomeTest");
	}

	/**
	 * 
	 */
	@Test
	@Override
	public void testIsGnoneFor() {
		assertTrue(((Race) classUnderTest).isGnoneFor(null));
	}
}
