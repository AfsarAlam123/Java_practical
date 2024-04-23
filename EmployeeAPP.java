package Alam;

public class EmployeeAPP {

	public static void main(String[] args) {
		Employee e1= new Employee ();
		e1.empid  =  13;
		e1.name   = "aaryan";
		e1.age    =  24;
		e1.gender = "male";
		e1.salary = 55454.33;
		e1.email  = "aaryan1@gmail.com";
		e1.work();
		e1.attendmeeting();
		new Employee ().work();

	}

}
