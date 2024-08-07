package com.bookmyflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com"})
@EnableJpaRepositories(basePackages = {"com"})
@EntityScan(basePackages = {"com"})
public class BookMyFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyFlightApplication.class, args);
	}

}
