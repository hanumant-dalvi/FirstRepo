package com.khelomore.pnp2.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PnpAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PnpAdminApplication.class, args);
	}

}
