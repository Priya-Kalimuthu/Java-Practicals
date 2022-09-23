package junit;

public class Employee {
	private int id,age;
	private String name;
	private double monthsalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthsalary() {
		return monthsalary;
	}
	public void setMonthsalary(double monthsalary) {
		this.monthsalary = monthsalary;
	}
	
	//calculate yearly salary
	public double calcYearlySalary() {
		double yearlySalary = getMonthsalary()*12;
		return yearlySalary;
	}
	
	//Calculate appraisal  for employee
	public double calcAppraisal() {
		double appraisal = 0;
		if (getMonthsalary()>30000) {
			appraisal = 1000;
		} else {
			appraisal = 500;

		}
		return appraisal;
	}

}
