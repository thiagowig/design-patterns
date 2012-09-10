package br.com.zaul.design.patterns.creational.abstractfactory;

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
