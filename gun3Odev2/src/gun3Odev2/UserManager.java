package gun3Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.id+" Kay�t ger�ekle�tirildi"+user.toString());
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
