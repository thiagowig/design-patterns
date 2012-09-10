package br.com.zaul.design.patterns.creational.abstractfactory;

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
