package br.com.zaul.design.patterns.creational.prototype.concreteprototype;

import br.com.zaul.design.patterns.creational.prototype.prototype.Beer;

public class Monasterium extends Beer {

	public Monasterium(String malt, String hop, Double alcoholicStrength) {
		super(malt, hop, alcoholicStrength);
	}
	
	@Override
	public Monasterium clone() throws CloneNotSupportedException {
		return (Monasterium) super.clone();
	}

}
