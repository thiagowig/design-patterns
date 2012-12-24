package br.com.zaul.design.patterns.creational.prototype.client;

import br.com.zaul.design.patterns.creational.prototype.concreteprototype.Indica;
import br.com.zaul.design.patterns.creational.prototype.concreteprototype.Monasterium;
import br.com.zaul.design.patterns.creational.prototype.prototype.Beer;

public class HomeBrew {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Beer beer = new Indica("MaltIndica", "HopIndica", 8.9);
		Beer beerClone = beer.clone();
		beerClone.setAlcoholicStrength(10D);
		
		System.out.println(beer.getAlcoholicStrength());
		System.out.println(beerClone.getAlcoholicStrength());
		
		beer = new Monasterium("MaltMonasterium", "HopMonasterium", 11D);
		beerClone = beer.clone();
		beerClone.setAlcoholicStrength(15D);
		
		System.out.println(beer.getAlcoholicStrength());
		System.out.println(beerClone.getAlcoholicStrength());
	}

}
