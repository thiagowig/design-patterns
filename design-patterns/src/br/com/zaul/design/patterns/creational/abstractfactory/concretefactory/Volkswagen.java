package br.com.zaul.design.patterns.creational.abstractfactory.concretefactory;

import br.com.zaul.design.patterns.creational.abstractfactory.CarModel;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory.CarAbstractFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Gol;
import br.com.zaul.design.patterns.creational.abstractfactory.concreteproduct.Jetta;

public class Volkswagen extends CarAbstractFactory {

	@Override
	public Car getCar(CarModel carModel) {
		if (carModel.equals(CarModel.GOL)) {
			return new Gol();
			
		} else if (carModel.equals(CarModel.JETTA)) {
			return new Jetta();
		}
		
		return null;
	}

}
