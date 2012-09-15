package br.com.zaul.design.patterns.creational.builder.concretebuilder;

import br.com.zaul.design.patterns.creational.builder.builder.PizzaBuilder;
import br.com.zaul.design.patterns.creational.builder.product.Pizza;

public class SpicyPizzaBuilder extends PizzaBuilder {

	private Pizza pizza;
	
	@Override
	public void createNewPizzaProduct() {
		this.pizza = new Pizza();
	}

	@Override
	public void buildDough() {
		pizza.setDough("pan baked"); 
	}
    
	@Override
	public void buildSauce() { 
		pizza.setSauce("hot");
	}
    
	@Override
	public void buildTopping() { 
		pizza.setTopping("pepperoni+salami"); 
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

	

}
