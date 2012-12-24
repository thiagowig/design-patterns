package br.com.zaul.design.patterns.creational.prototype.concreteprototype;

import br.com.zaul.design.patterns.creational.prototype.prototype.Beer;

public class Indica extends Beer {

	public Indica(String malt, String hop, Double alcoholicStrength) {
		super(malt, hop, alcoholicStrength);
	}
	
	@Override
	public Indica clone() throws CloneNotSupportedException {
		return (Indica) super.clone();
	}

}
