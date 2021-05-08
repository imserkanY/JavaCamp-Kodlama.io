package projeOdevi3;

public class Main {
	public static void main(String[] args) {
		
		Instructor insturctor = new Instructor();
		insturctor.setId(1);
		insturctor.setFirstName("Engin");
		insturctor.setLastname("DEMİROĞ");
		insturctor.setInternationalId("12345678910");
		insturctor.setInstructorRate("5");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Serkan");
		student.setLastname("YAZLI");
		student.setInternationalId("48485644584");
		student.setStudentNumber("540");
		
		User user = new User();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(insturctor);
		System.out.println();
		instructorManager.about(insturctor);
		System.out.println();
		instructorManager.delete(insturctor);
		System.out.println("--------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		System.out.println();
		studentManager.about(student);
		System.out.println();
		studentManager.delete(student);
		System.out.println("--------------------------------");

		
		
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.about(user);
		userManager.delete(user);
		System.out.println("--------------------------------");
	}
}
