package br.com.zaul.design.patterns.creational.builder.director;

import br.com.zaul.design.patterns.creational.builder.builder.PizzaBuilder;
import br.com.zaul.design.patterns.creational.builder.product.Pizza;

public class Waiter {

	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getPizza() {
		return this.pizzaBuilder.getPizza();
	}
	
	public void constructPizza() {
		this.pizzaBuilder.createNewPizzaProduct();
		this.pizzaBuilder.buildDough();
		this.pizzaBuilder.buildSauce();
		this.pizzaBuilder.buildTopping();
	}
}
