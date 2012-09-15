package br.com.zaul.design.patterns.creational.builder.client;

import br.com.zaul.design.patterns.creational.builder.builder.PizzaBuilder;
import br.com.zaul.design.patterns.creational.builder.concretebuilder.SpicyPizzaBuilder;
import br.com.zaul.design.patterns.creational.builder.director.Waiter;

public class OrderPizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new SpicyPizzaBuilder();
		Waiter waiter = new Waiter();
		waiter.setPizzaBuilder(pizzaBuilder);
		
		waiter.constructPizza();
		
		System.out.println(waiter.getPizza().getDough());
		System.out.println(waiter.getPizza().getSauce());

	}

}
