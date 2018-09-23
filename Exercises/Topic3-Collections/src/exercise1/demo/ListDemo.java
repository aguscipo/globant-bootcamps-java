package exercise1.demo;
/* Suppose Globant select every month one employee as the "Employee of the month" to motivate productivity.
 * To represent the list of employees I use a List collection (specifically an array list)
 * because the same employee can be choose more than once and also because represents well the order.
 * The last employee of the month will be at the end of the List.
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import exercise1.model.Employee;

public class ListDemo  {

	public static void main(String[] args) {

		List<Employee> employeesOfTheMonth = new ArrayList<Employee>();
		addMockEmployees(employeesOfTheMonth);
		sortByDate(employeesOfTheMonth);
		sortByFirstName(employeesOfTheMonth);
		sortBysurname(employeesOfTheMonth);
		sortByAge(employeesOfTheMonth);
		sortByPosition(employeesOfTheMonth);
	}
	
	public static void sortByDate(List<Employee> employees) {
		System.out.println("Employees of the month sorted by date: ");
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName() + " " + employee.getSurname());
		}
		System.out.println("--------------------------------------------------------");
	}

	public static void sortByFirstName(List<Employee> employees) {
		Collections.sort(employees, Comparator.comparing(Employee::getFirstName));
		System.out.println("Employees sorted by Name: ");
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName() + " " + employee.getSurname());
		}
		System.out.println("--------------------------------------------------------");
	}

	public static void sortBysurname(List<Employee> employees) {
		Collections.sort(employees, Comparator.comparing(Employee::getSurname));
		System.out.println("Employees sorted by Surname: ");
		for (Employee employee : employees) {
			System.out.println(employee.getSurname() + " " + employee.getFirstName());
		}
		System.out.println("--------------------------------------------------------");
	}
	
	public static void sortByAge(List<Employee> employees) {
		Collections.sort(employees, Comparator.comparing(Employee::getAge));
		System.out.println("Employees sorted by Age: ");
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName() + " " + employee.getSurname() +  " " + employee.getAge() );
		}
		System.out.println("--------------------------------------------------------");
	}
	
	public static void sortByPosition(List<Employee> employees) {
		Collections.sort(employees, Comparator.comparing(Employee::getPosition));
		System.out.println("Employees sorted by Position: ");
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName() + " " + employee.getSurname() + " " + employee.getPosition() );
		}
		System.out.println("--------------------------------------------------------");
	}


	/* Adding the employees selected on the last 5 months 
	 * */
	private static void addMockEmployees(List<Employee> employees) {
		Employee emp1 = new Employee(1, 28, "Juan", "Perez", "Developer");
		employees.add(emp1);
		Employee emp2 = new Employee(2, 32, "Jose", "Zaro", "QA");
		employees.add(emp2);
		Employee emp3 = new Employee(3, 40, "Luis", "Sanchez", "Developer");
		employees.add(emp3);
		Employee emp4 = new Employee(4, 45, "Ignacio", "Castro", "DBA");
		employees.add(emp4);
		employees.add(emp1); //This employee will appear twice at the list

	}


}
