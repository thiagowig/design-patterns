package br.com.zaul.design.patterns.structural.composite.leaf;

import br.com.zaul.design.patterns.structural.composite.component.Employee;

/**
 * A class that represents a Thiago Employee
 * @author thiago
 */
public class Thiago implements Employee {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doWork() {
		System.out.println("Thiago is a Hard worker");
	}

}
