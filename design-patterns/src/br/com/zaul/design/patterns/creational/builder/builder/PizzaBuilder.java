package br.com.zaul.design.patterns.creational.builder.builder;

import br.com.zaul.design.patterns.creational.builder.product.Pizza;

/**
 * @author thiago
 *
 */
public abstract class PizzaBuilder {
	
	public abstract void createNewPizzaProduct();
 
    public abstract void buildDough();
    
    public abstract void buildSauce();
    
    public abstract void buildTopping();
    
	public abstract Pizza getPizza();

    
}
