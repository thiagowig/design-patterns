package br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory;

import br.com.zaul.design.patterns.creational.abstractfactory.CarFactoryType;
import br.com.zaul.design.patterns.creational.abstractfactory.CarName;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;
import br.com.zaul.design.patterns.creational.abstractfactory.concretefactory.Fiat;
import br.com.zaul.design.patterns.creational.abstractfactory.concretefactory.Volkswagen;

public abstract class CarAbstractFactory {

	private static CarAbstractFactory carAbstractFactory;
	
	public abstract Car getCar(CarName carModel);
	
	public static CarAbstractFactory getInstance(CarFactoryType carFactory) {
		if (carAbstractFactory == null) {
			generateInstance(carFactory);
		}

		return carAbstractFactory;
	}

	private static void generateInstance(CarFactoryType carFactory) {
		if (carFactory.equals(CarFactoryType.VOLKSWAGEN)) {
			carAbstractFactory = new Volkswagen();
			
		} else if (carFactory.equals(CarFactoryType.FIAT)) {
			carAbstractFactory = new Fiat();
		}
		
	}
}
