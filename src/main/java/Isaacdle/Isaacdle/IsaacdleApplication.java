package Isaacdle.Isaacdle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "Isaacdle.Isaacdle.repositories")
public class IsaacdleApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsaacdleApplication.class, args);
	}

}
