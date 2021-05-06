package GroupTests;

public class Department {

	Integer id;
	
	Department(Integer id)
	{
		this.id = id;
	}

	
	
	@Override
	public String toString() {
		return "Department [id=" + id + "]";
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
