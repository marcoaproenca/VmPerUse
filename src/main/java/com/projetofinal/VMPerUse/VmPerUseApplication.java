package com.projetofinal.VMPerUse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = ".com.projetofinal.VMPerUse")
public class VmPerUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmPerUseApplication.class, args);
	}

}
