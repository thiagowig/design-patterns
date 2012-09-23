package br.com.zaul.design.patterns.structural.composite.leaf;

import br.com.zaul.design.patterns.structural.composite.component.Employee;

/**
 * A class that represents a John Employee
 * @author thiago
 */
public class John implements Employee {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doWork() {
		System.out.println("John is a Lazy work");
	}

}
