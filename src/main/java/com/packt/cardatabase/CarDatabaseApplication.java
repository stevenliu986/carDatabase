package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarDatabaseApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CarDatabaseApplication.class);

    private final CarRepository repository;

    public CarDatabaseApplication(CarRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CarDatabaseApplication.class, args);
        logger.info("Car Database Application Started");
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2023, 59000));
        repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000));
        repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2022, 39000));

        // fetch all cars and log to console
        for (Car car : repository.findAll()) {
            logger.info("brand: {}, model: {}", car.getBrand(), car.getModel());
        }
    }
}
