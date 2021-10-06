package Project1;

import Database.queries.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application1Error {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	public AccountRepository accountRepository;
	@GetMapping("/addAccount")
	public void addAccount(@RequestParam Long miles){
		AccountRepository.insertAccount(miles);
	}

	@GetMapping("/viewMiles")
	public Long viewMiles(@RequestParam Long id) {
		return accountRepository.findMilesById(id);
	}

	@GetMapping("/addMiles")
	public String addMiles(@RequestParam(defaultValue = "No ID") Long id, @RequestParam(defaultValue = "No miles to add") Long newMiles){
		accountRepository.updateMiles(id,accountRepository.findMilesById(id)+newMiles);
		return newMiles + " miles where added to your account. Your new balance is: " + accountRepository.findMilesById(id);
	}

	@GetMapping("/subtractMiles")
	public String subtractMiles(@RequestParam(defaultValue = "No ID") Long id, @RequestParam(defaultValue = "No miles to subtract") Long newMiles) {
		accountRepository.updateMiles(id,accountRepository.findMilesById(id)-newMiles);
		return newMiles + " miles where deducted from your account. Your new balance is: " + accountRepository.findMilesById(id);
	}

	@GetMapping("/Hello")
	public String test(){
		return "Testing testing 1 2 3";
	}
	public String gitTest() { return "Inserted to test GitHub version control"; }

}
