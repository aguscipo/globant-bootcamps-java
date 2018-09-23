package exercise1.demo;

import java.util.ArrayList;

/*
 * Suppose we need a list to save members of each project of Globant.
 * I use a Set collection because the same employee must 
 * not be added more than once at the same project. 
 * Besides we are not interesting in the order of the employees.
 * 
 */


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exercise1.model.Employee;
import exercise1.model.Project;

public class SetDemo {

	public static void main(String[] args) {
		Set<Employee> members=new HashSet<Employee>();
		addMockMembers(members);
		Employee projectLeader = new Employee(5, 33, "Ignacio", "Castro", "PL");
		Employee projectManager = new Employee(4, 45, "Felipe", "Ruiz", "PM");
		Project project1 = new Project(members, projectLeader, projectManager, 1);
		print(project1);
		List<Employee> list = new ArrayList<Employee>(project1.getMembers()); //I create a list to order the members
		ListDemo.sortByFirstName(list);
		ListDemo.sortBysurname(list);
		ListDemo.sortByAge(list);
		ListDemo.sortByPosition(list);
	}
	private static void addMockMembers(Set<Employee> members) {
		Employee e1 = new Employee(1, 28, "Juan", "Perez", "Developer");
		members.add(e1);
		Employee e2 = new Employee(2, 32, "Jose", "Zaro", "QA");
		members.add(e2);
		Employee e3 = new Employee(3, 40, "Luis", "Sanchez", "Developer");
		members.add(e3);
		members.add(e3); // If I add the same employee 2 times just will add once because is a set collection
	}
	
	private static void print(Project project) {

		System.out.println("Members of  Project "+ project.getId() + ": ");
		for (Employee member : project.getMembers()) {
			System.out.println(member.getFirstName() + " " + member.getSurname() +  " " + member.getPosition() );
		}
		System.out.println("--------------------------------------------------------");
	}
	

	

}
