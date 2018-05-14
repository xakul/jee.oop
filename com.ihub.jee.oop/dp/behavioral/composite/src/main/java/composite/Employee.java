package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	/*
	 * Creating the atributes.
	 * Değişkenlerimizi yaratıyoruz.
	 */
	private String name;
	private String department;
	private int salary;
	
	/*
	 * We also keep the subordinates of an Employee as a list.
	 * Çalışanların(Employee) altında bulunan diğer çalışanların listesini de tutuyoruz.
	 */
	private List<Employee> subordinates;

	/*
	 * Attributes are filled in constructor.
	 * Değerleri constructor'da dolduruyoruz.
	 */
	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	/*
	 * This function adds an Employee as an subordinate to the instances' employee.
	 * Bu fonksiyon, objesi yaratılan çalışanın, altında çalışan bir insanı listeye atar.
	 */
	public void add(Employee employee) {
		subordinates.add(employee);
	}
	
	/* Similarly, removes an Employee from the subordinates list.
	 * Benzer şekilde, bir çalışanı, objesi yaratılan çalışanın alt çalışan listesinden siler.
	 */
	public void remove(Employee employee) {
		subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Employee:" + "\n	" + "Name : " + name + "\n	" + "Department: " + department + "\n	" +"Salary: " + salary);
	}
}