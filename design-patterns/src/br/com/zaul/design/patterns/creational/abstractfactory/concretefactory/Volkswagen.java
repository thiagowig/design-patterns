package br.com.zaul.design.patterns.creational.abstractfactory.concretefactory;

import br.com.zaul.design.patterns.creational.abstractfactory.CarName;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory.CarAbstractFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Gol;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Jetta;

public class Volkswagen extends CarAbstractFactory {

	@Override
	public Car getCar(CarName carModel) {
		if (carModel.equals(CarName.GOL)) {
			return new Gol();
			
		} else if (carModel.equals(CarName.JETTA)) {
			return new Jetta();
		}
		
		return null;
	}

}
