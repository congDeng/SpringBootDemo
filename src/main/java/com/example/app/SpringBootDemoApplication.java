package com.example.app;
import com.example.app.model.Alien;
import com.example.app.model.Laptop;
import com.example.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDemoApplication.class, args);
//		Alien alien = applicationContext.getBean(Alien.class);
//		alien.code();
		Laptop laptop = applicationContext.getBean(Laptop.class);
		LaptopService laptopService = applicationContext.getBean(LaptopService.class);
		laptopService.addLaptop(laptop);
	}

//	@GetMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}
}