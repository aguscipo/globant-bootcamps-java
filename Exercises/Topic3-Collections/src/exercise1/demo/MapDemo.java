package exercise1.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import exercise1.model.*;

/*
 * I use a Map (sepecifically a HashMap implementation) to divide 
 * employees according to their position. The key will be the name
 * of the position (p.e "Developer") and the value will be the list
 * of those employees who belong to that position in the company.
 * 
 */

public class MapDemo {
	public static void main(String[] args) {
		//Create a list and add all the employees
		List<Employee> employees = new ArrayList<Employee>();
		addMockEmployees(employees);
		
		//Create a Map to group the employees according to their position
		Map<String, ArrayList<Employee>> employeesByPosition = new HashMap<String, ArrayList<Employee>>();
		
		//Add keys and values to the HashMap
		createHashMap(employeesByPosition, employees);
		
		//Print result
		print(employeesByPosition);

	}
	
	/* Adding emloyees and their respective position in the company 
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
		Employee emp5 = new Employee(4, 45, "Raul", "Fernandez", "QA");
		employees.add(emp5);
	}
	
	/*
	 * Iterate over the HashMap. If the key exists I add the employee to the list of employees with the same
	 * postion, if not I put the new key with the first employee into the HashMap.
	 */
	private static void createHashMap(Map<String, ArrayList<Employee>> employeesByPosition, List<Employee> employees) {
		Iterator<Employee> iterator = employees.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			String key= emp.getPosition();
			if (employeesByPosition.containsKey(key)){
				employeesByPosition.get(key).add(emp);
				employeesByPosition.get(key);
			}else {
				ArrayList<Employee> listEmp = new ArrayList<Employee>();
				listEmp.add(emp);
				employeesByPosition.put(key, listEmp);
			}
		}
	}
	
	private static void print (Map<String, ArrayList<Employee>> employeesByPosition){
	    Iterator<Entry<String, ArrayList<Employee>>> it = employeesByPosition.entrySet().iterator();
	    while (it.hasNext()) {
	        @SuppressWarnings("rawtypes")
			Map.Entry pair = it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}

}
