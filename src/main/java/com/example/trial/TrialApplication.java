package com.example.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrialApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(TrialApplication.class, args);
	}

	/*
	 * @Autowired UserRepository userRepository;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * userRepository.save(new Member(1, "admin", "admin1234", "관리자",
	 * "admin5959@fakemail.com"));
	 * 
	 * }
	 */

}
