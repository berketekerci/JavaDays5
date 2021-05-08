package eCommerence.core;

import eCommerence.entities.concretes.LoginDto;

public interface ExternalAuthService {
	void register(String email);
	boolean userExist(String email);
	void login(LoginDto dto);
	
}
