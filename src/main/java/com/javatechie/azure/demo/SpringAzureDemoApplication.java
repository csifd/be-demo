package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
<<<<<<< HEAD

	@GetMapping("/hi")
=======
//main branch
	@GetMapping("/message")
>>>>>>> 2df660dd5b2dc6889450283a7ef560ddae311140
	public String message(){
		return "Congrats ! your application deployed successfully in Azure Platform. !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
