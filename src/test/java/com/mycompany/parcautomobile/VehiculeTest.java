package com.mycompany.parcautomobile;

import org.junit.Assert;
import org.junit.Test;

public class VehiculeTest {

	@Test
	public void testPrixMajore() {
		
		// initialisation de l'objet vehicule
		Vehicule vehicule = new Vehicule();
		// affectation du prix
		vehicule.setPrix(10000.00);
		
		// calcul du prix majoré
		double prixMajore = vehicule.getPrixMajore();
			
		Assert.assertTrue(prixMajore == 11000.00);

	}

}
