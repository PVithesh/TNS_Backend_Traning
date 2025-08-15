//main function for student
public class StudentMain {

	public static void main(String[] args) {
		
		Student ob = new Student();
		ob.rollno = 1010;
		ob.sname = "Vithesh";
		ob.sbranch = "CSE-C";
		ob.print();
		
		Student obj = new Student();
		obj.rollno = 1020;
		obj.sname = "Kalyan";
		obj.sbranch = "CSE-A";
		obj.print();
		
		Student op = new Student();
		op.rollno = 1030;
		op.sname = "Vivek";
		op.sbranch = "CSE-C";
		op.print();
		
	}

}
