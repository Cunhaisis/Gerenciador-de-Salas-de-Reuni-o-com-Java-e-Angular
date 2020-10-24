package com.devisis.saladereuniao.saladereuniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"/saladereuniao/src/main/java/com/devisis/saladereuniao/saladereuniao/SaladereuniaoApplication.java"})
public class SaladereuniaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaladereuniaoApplication.class, args);
	}

}
