package br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory;

import br.com.zaul.design.patterns.creational.abstractfactory.CarFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.CarModel;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;
import br.com.zaul.design.patterns.creational.abstractfactory.concretefactory.Fiat;
import br.com.zaul.design.patterns.creational.abstractfactory.concretefactory.Volkswagen;

public abstract class CarAbstractFactory {

	private static CarAbstractFactory carAbstractFactory;
	
	public abstract Car getCar(CarModel carModel);
	
	public static CarAbstractFactory getInstance(CarFactory carFactory) {
		if (carAbstractFactory == null) {
			generateInstance(carFactory);
		}

		return carAbstractFactory;
	}

	private static void generateInstance(CarFactory carFactory) {
		if (carFactory.equals(CarFactory.VOLKSWAGEN)) {
			carAbstractFactory = new Volkswagen();
			
		} else if (carFactory.equals(CarFactory.FIAT)) {
			carAbstractFactory = new Fiat();
		}
		
	}
}
