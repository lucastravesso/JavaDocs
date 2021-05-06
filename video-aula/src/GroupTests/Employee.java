package GroupTests;

public class Employee {

	String name;
	Department id_dept;
	
	Employee(String name, Department id_dept)
	{
		this.name = name;
		this.id_dept = id_dept;
	}

	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id_dept=" + id_dept + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getId_dept() {
		return id_dept;
	}
	public void setId_dept(Department id_dept) {
		this.id_dept = id_dept;
	}
	
}
