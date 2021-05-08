package eCommerence.core;

import eCommerence.business.abstracts.UserService;
import eCommerence.entities.concretes.LoginDto;
import eCommerence.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService {
	private UserService userService;

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		if (userExist(email) == false) {
			userService.add(null);
		} else {
			User user = userService.get(email);

			LoginDto dto = new LoginDto();
			dto.setEmail(user.getEmail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}

	}

	@Override
	public boolean userExist(String email) {
		if (userService.get(email)!=null) {
			return true;
		}
		return false;
	}

	@Override
	public void login(LoginDto dto) {
		if(dto!=null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Baþarýyla Giriþ Yaptýnýz.");
		}

	}

}
