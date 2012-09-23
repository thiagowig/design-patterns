package br.com.zaul.design.patterns.structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.zaul.design.patterns.structural.composite.component.Employee;

/**
 * A composite class 
 * @author thiago
 */
public class ProjectTeam implements Employee {

	/** A List of employees */
	private List<Employee> employees;
	
	/**
	 * Constructor
	 */
	public ProjectTeam() {
		this.employees = new ArrayList<Employee>();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doWork() {
		for (Employee employee : this.employees) {
			employee.doWork();
		}
	}

	/**
	 * Add a employee in a list.
	 * @param employee A Employee 
	 * @return <code>true</code> if a Employee is added with success
	 */
	public boolean addEmployee(Employee employee) {
		return this.employees.add(employee);
	}
	
	/**
	 * Remove a employee from list.
	 * @param employee A Employee 
	 * @return <code>true</code> if a Employee is removed with success
	 */
	public boolean removeEmployee(Employee employee) {
		return this.employees.remove(employee);
	}
}
