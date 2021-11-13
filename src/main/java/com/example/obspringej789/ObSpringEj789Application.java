package com.example.obspringej789;

import com.example.obspringej789.entities.Laptop;
import com.example.obspringej789.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObSpringEj789Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringEj789Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop asus = new Laptop(null, "Asus", "V40", 8, 15.6, LocalDate.of(2020, 12, 12),false);
		Laptop dell = new Laptop(null, "Dell", "JWC", 16, 17.0, LocalDate.of(2018, 7, 31),true);
		Laptop hp = new Laptop(null, "HP", "Minion", 32, 13.5, LocalDate.of(2014, 5, 3),false);

		repository.save(asus);
		repository.save(dell);
		repository.save(hp);

	}

}
