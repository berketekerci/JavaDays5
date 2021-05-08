package eCommerence;

import eCommerence.business.concretes.AuthManager;
import eCommerence.business.concretes.UserManager;
import eCommerence.core.amazonEmail.AmazonMailManagerAdapter;
import eCommerence.dataAccess.concretes.InMemoryUserDao;
import eCommerence.entities.concretes.User;
import eCommerence.core.googleEmail.GoogleMailManagerAdapter;

public class Main {

	public static void main(String[] args) {
		InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, 
				new AmazonMailManagerAdapter()));
		User ahmet=new User(2,"Ahmet Berke","Tekerci","ahmet@gmail.com","123456",true);
		User emre=new User(2,"Emre","Alkan","emrealkan@gmail.com","123456",true);
		
		
		authManager.register(ahmet);
		authManager.register(emre);
		
		UserManager userManager=new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		userManager.getAll();
		
	}

}
