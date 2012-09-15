package br.com.zaul.design.patterns.creational.builder.concretebuilder;

import br.com.zaul.design.patterns.creational.builder.builder.PizzaBuilder;
import br.com.zaul.design.patterns.creational.builder.product.Pizza;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	private Pizza pizza;
	
	@Override
	public void createNewPizzaProduct() {
		this.pizza = new Pizza();
	}

	@Override
	public void buildDough() {
		pizza.setDough("cross"); 
	}
    
	@Override
	public void buildSauce() { 
		pizza.setSauce("mild");
	}
    
	@Override
	public void buildTopping() { 
		pizza.setTopping("ham+pineapple"); 
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

	

}
