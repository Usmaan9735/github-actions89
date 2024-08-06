package com.microservice.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CommentApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to 5G";
	}

//	echo "# github-actions89" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Usmaan9735/github-actions89.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(CommentApplication.class, args);
	}

}
