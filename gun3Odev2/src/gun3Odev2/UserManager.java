package gun3Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.id+" Kayıt gerçekleştirildi"+user.toString());
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
