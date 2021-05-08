package projeOdevi3;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Instructor " + user.getFirstName() + " ;" + " Added.");
	}	
	@Override
	public void delete(User user) {
		System.out.println("Instructor " + user.getFirstName() + " ;" + " Deleted.");
	}
	@Override
	public void about(User user) {
		System.out.println("Instructor id = " + user.getId() + "\nInstructor First Name = " +  
			user.getFirstName() + "\nInstructor Last Name = " +  user.getLastname() + "\nInstructor International Id  = " + 
			user.getInternationalId());
	}
}
