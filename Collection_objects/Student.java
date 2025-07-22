package Collection_objects;

public class Student {
	
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public int compareTo(Student e) {
		if(age==e.age)
		return 0;
		else if(age>e.age)
			return 1;
		else
			return -1;
	}
	
	
	

}
