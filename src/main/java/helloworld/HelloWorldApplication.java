package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	@GetMapping("/")
	public String helloWorld() {
		String st= "Hello, Welcome!";
		String s=" This is Spring Boot Application";
		return st+s;

	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
