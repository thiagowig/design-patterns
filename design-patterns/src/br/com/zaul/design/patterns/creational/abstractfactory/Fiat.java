package br.com.zaul.design.patterns.creational.abstractfactory;

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
