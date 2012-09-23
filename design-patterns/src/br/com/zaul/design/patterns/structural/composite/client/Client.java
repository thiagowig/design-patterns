package br.com.zaul.design.patterns.structural.composite.client;

import br.com.zaul.design.patterns.structural.composite.composite.ProjectTeam;
import br.com.zaul.design.patterns.structural.composite.leaf.John;
import br.com.zaul.design.patterns.structural.composite.leaf.Thiago;

/**
 * Test a composite pattern 
 * @author thiago
 */
public class Client {

	/**
	 * Main 
	 */
	public static void main(String[] args) {
		ProjectTeam composite = new ProjectTeam();
				
		Thiago thiago = new Thiago();
		John john = new John();
		
		composite.addEmployee(thiago);
		composite.addEmployee(john);
		
		composite.doWork();
	}
}
