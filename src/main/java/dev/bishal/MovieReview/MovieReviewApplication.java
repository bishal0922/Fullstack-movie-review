package dev.bishal.MovieReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//rest api controller let the spring boot know that this is the main class and not just another class
@RestController
public class MovieReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewApplication.class, args);
	}

	//this annotation let the spring boot know that this is the root of the api (our GET endpoint)
	// "/" is the root of the api 
	@GetMapping("/")
	public String apiRoot(){
		return "Hello World";
	}
}
