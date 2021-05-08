package eCommerence.core.amazonEmail;

import eCommerence.amazonMail.AmazonMailManager;
import eCommerence.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService {
	
	
	private AmazonMailManager amazonMailManager;

	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
		
		
	}

}
