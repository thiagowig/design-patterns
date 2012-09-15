package br.com.zaul.design.patterns.creational.abstractfactory.client;

import br.com.zaul.design.patterns.creational.abstractfactory.CarFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.CarModel;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractfactory.CarAbstractFactory;
import br.com.zaul.design.patterns.creational.abstractfactory.abstractproduct.Car;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarAbstractFactory carAbstractFactory = CarAbstractFactory.getInstance(CarFactory.FIAT);
		
		Car car = carAbstractFactory.getCar(CarModel.BRAVO);
		
		System.out.println("The name of the car: " + car.getName());

	}

}
