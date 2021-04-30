package gun3Odev2;

public class Main {

	public static void main(String[] args) {
	Instructor instructor= new Instructor();
	Student student= new Student();
	UserManager userManager= new UserManager();
	instructor.id=1;
	student.id=2;
	student.bitirilenOdevAdý="constructor";
	User[] users= {instructor,student};
	
	userManager.addMultiple(users);
	
	DortIslem topla= new DortIslem();
	System.out.println("islem=" +topla.topla(15,25));
	System.out.println("islem=" +topla.topla(15,25,35));
			

	}

}
