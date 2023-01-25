package be.technifutur.java.mvc;

import be.technifutur.java.mvc.utils.EMFSharer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DemoSpringMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(DemoSpringMvcApplication.class, args);


		ctxt.getBean(EMFSharer.class).close();
	}

}
