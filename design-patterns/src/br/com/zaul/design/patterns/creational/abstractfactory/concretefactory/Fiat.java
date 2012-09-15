package br.com.zaul.design.patterns.creational.abstractfactory.concretefactory;

import br.com.zaul.design.patterns.creational.abstractfactory.CarModel;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory.CarAbstractFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Bravo;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Palio;

public class Fiat extends CarAbstractFactory {

	@Override
	public Car getCar(CarModel carModel) {
		if (carModel.equals(CarModel.PALIO)) {
			return new Palio();
			
		} else if (carModel.equals(CarModel.BRAVO)) {
			return new Bravo();
		}
		
		return null;
	}

}
