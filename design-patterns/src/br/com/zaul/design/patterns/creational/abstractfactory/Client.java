package br.com.zaul.design.patterns.creational.abstractfactory;

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
