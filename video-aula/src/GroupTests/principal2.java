package GroupTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class principal2 {

	public static void main(String[] args) {
		List<Department> departments = new ArrayList<Department>();
		departments.add(new Department(0));
		departments.add(new Department(1));
		departments.add(new Department(2));
		departments.add(new Department(3));
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Lassy",departments.get(0)));
		employees.add(new Employee("Jhonny",departments.get(0)));
		employees.add(new Employee("Sasha",departments.get(2)));
		employees.add(new Employee("Aaron",departments.get(1)));
		employees.add(new Employee("Jordan",departments.get(3)));
		employees.add(new Employee("Peter",departments.get(2)));

		Map<Department, List<Employee>> byDept = employees
												.stream()
												.collect(Collectors.groupingBy(Employee::getId_dept));
		
		byDept.entrySet().stream().forEach(d ->{
		  
			System.out.println(d.getKey());
			System.out.println(d.getValue().stream().map(m ->
			m.getName()).collect(Collectors.toList()));
		  
		});
		 
	}
	
}
