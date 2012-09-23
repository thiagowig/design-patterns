package br.com.zaul.design.patterns.creational.factory.concreteproduct;

import br.com.zaul.design.patterns.creational.factory.product.VideoGame;

public class Playstation3 implements VideoGame {

	@Override
	public void play() {
		System.out.println("Playing with Playstation 3");
	}

}
