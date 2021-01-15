package com.chrisgya.maskinglog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MaskingLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaskingLogApplication.class, args);
	}

	private static final Logger logger = LoggerFactory.getLogger(MaskingLogApplication.class);

	@PostMapping
	public void myPosterLogger(@RequestBody PostRequest req){
		logger.info("Error occurred for post: {}", req);
	}

	/*
	curl --location --request POST 'http://localhost:8080' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName":"John",
     "lastName":"Mensah",
     "password":"Password@1",
     "confirmPassword":"Pa ss$word@1",
     "birthDate":"1990-10-20",
     "passportNo": "pass12345",
     "identityNumber":"10'\''1010'\''%"
}'
	 */

}
