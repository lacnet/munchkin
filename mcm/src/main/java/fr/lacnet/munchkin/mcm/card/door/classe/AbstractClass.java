package fr.lacnet.munchkin.mcm.card.door.classe;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;

/**
 * @author jlacroix
 */
public abstract class AbstractClass extends AbstractDoor implements Class {

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isBonus()
	 */
	public final boolean isBonus() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isClass()
	 */
	public final boolean isClass() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isCurse()
	 */
	public final boolean isCurse() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isMonster()
	 */
	public final boolean isMonster() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isRace()
	 */
	public final boolean isRace() {
		// TODO Auto-generated method stub
		return false;
	}
}
