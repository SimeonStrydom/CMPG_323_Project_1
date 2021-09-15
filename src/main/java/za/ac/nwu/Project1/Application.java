package za.ac.nwu.Project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	@GetMapping("/Hello")
	public String test(){
		return "Testing testing 1 2 3";
	}
	public String gitTest() { return "Inserted to test GitHub version control"; }

}
