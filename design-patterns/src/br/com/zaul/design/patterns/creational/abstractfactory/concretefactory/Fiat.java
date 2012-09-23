package br.com.zaul.design.patterns.creational.abstractfactory.concretefactory;

import br.com.zaul.design.patterns.creational.abstractfactory.CarName;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory.CarAbstractFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Bravo;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Palio;

public class Fiat extends CarAbstractFactory {

	@Override
	public Car getCar(CarName carModel) {
		if (carModel.equals(CarName.PALIO)) {
			return new Palio();
			
		} else if (carModel.equals(CarName.BRAVO)) {
			return new Bravo();
		}
		
		return null;
	}

}
