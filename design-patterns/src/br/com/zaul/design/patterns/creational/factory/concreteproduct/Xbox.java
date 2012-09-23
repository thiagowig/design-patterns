package br.com.zaul.design.patterns.creational.factory.concreteproduct;

import br.com.zaul.design.patterns.creational.factory.product.VideoGame;

public class Xbox implements VideoGame {

	@Override
	public void play() {
		System.out.println("Playing with Xbox");
	}

}
