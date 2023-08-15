package bankAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private BankAccountRepository bankAccountRepo;

	@Autowired
	private UserProxy proxy;
	
	
}
