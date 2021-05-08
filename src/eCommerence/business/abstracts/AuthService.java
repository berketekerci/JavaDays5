package eCommerence.business.abstracts;

import eCommerence.entities.concretes.LoginDto;
import eCommerence.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
	
}
