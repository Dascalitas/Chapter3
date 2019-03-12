package homeworkChapter3;

class Employee {
	private String firstName;
	private String lastName;
	private double monthSal;

	Employee(String firstName, String lastName, double monthSal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthSal = monthSal;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	double getMonthSal() {
		return monthSal;
	}

	void setFirstName() {
		this.firstName = firstName;
	}

	void setLastName() {
		this.lastName = lastName;
	}

	void setMonthSal(double monthSal) {
		if (monthSal < 0.0)
			this.monthSal = 0.0;
		else
			this.monthSal = monthSal;
	}

	double yearSal() {
		double yearSal = monthSal * 12;
		return yearSal;
	}

	double yearSal2() {
		double yearSal2 = (monthSal + (monthSal * 0.1)) * 12;
		return yearSal2;
	}
}

public class Homework3 {

	public static void main(String[] args) {
		Employee worker1 = new Employee("Kazantip", "Akakii", 17000.0);
		System.out.println(worker1.getFirstName() + " " + worker1.getLastName() + " had in every month "
				+ worker1.getMonthSal() + "$");
		System.out.printf("%s %s %s %.2f$\n", worker1.getFirstName(), worker1.getLastName(), "had in every month", worker1.getMonthSal());
		System.out.println("in year he have " + worker1.yearSal() + "$");
		System.out.println("in year he have " + worker1.yearSal2() + "$ with 10 % bonus");

		Employee worker2 = new Employee("Tomorowland", "Eleonora", 250000.0);
		System.out.println(worker2.getFirstName() + " " + worker2.getLastName() + " had in every month "
				+ worker2.getMonthSal() + "$");
		System.out.println("in year she have " + worker2.yearSal() + "$");
		System.out.println("in year she have " + worker2.yearSal2() + "$ with 10 % bonus");

		worker1.setMonthSal(-1000.0);
		System.out.println("For now, " + worker1.getFirstName() + " " + worker1.getLastName() + " had in every month "
				+ worker1.getMonthSal() + "$");
	}

}


//3.13	(Employee Class) Create a class called Employee that includes three instance variables—a first name (type String),
//a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance 
//variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not
//set its value. Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee 
//objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
//again. 
