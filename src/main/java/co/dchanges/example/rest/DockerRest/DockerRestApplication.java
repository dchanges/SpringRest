package co.dchanges.example.rest.DockerRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerRestApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker from Digital Changes V3";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerRestApplication.class, args);
	}

}
