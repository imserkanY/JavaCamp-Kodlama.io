package projeOdevi3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Student " + user.getFirstName() + " ;" + " Added.");
	}
	@Override
	public void delete(User user) {
		System.out.println("Student " + user.getFirstName() + " ;" + " Deleted.");
	}
	@Override
	public void about(User user) {
		System.out.println("Student id = " + user.getId() + "\nStudent First Name = " +  
			user.getFirstName() + "\nStudent Last Name = " +  user.getLastname() + "\nStudent International Id  = " + 
			user.getInternationalId());
	}
}
