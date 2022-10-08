package com.E456.Ejercicio;


import com.E456.Ejercicio.entities.Laptop;
import com.E456.Ejercicio.repository.LaptopRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioApplication.class, args);
		LaptopRepository lr = context.getBean(LaptopRepository.class);


		Laptop l1 = new Laptop(null, "HP", 15, true);
		Laptop l2 = new Laptop(null, "Lenovo", 14, true);
		Laptop l3 = new Laptop(null, "Asus", 16, false);

		lr.save(l1);
		lr.save(l2);
		lr.save(l3);




	}
}
