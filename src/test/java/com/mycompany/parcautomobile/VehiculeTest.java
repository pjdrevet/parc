package com.mycompany.parcautomobile;

import org.junit.Assert;
import org.junit.Test;

public class VehiculeTest {

	@Test
	public void testPrixMajore() {
		
		double percent = 10.00;
		
		Vehicule vehicule = new Vehicule();
		vehicule.setPrix(1000.00);
		
		Assert.assertTrue(vehicule.getPrixMajore(percent) == 10000.00);

	}

}
