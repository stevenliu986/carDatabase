package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * ClassName: CarRepository
 * Package: com.packt.cardatabase.domain
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 2024/8/20
 */
public interface CarRepository extends CrudRepository<Car, Long> {
    // fetch cars by brand
    List<Car> findByBrand(String brand);

    // fetch cars by brand using SQL
    // @Query("select c from Car c where c.brand = ?1")
    // List<Car> findByBrand(String brand);

    // fetch cars by color
    List<Car> findByColor(String color);

    // fetch cars by model year
    List<Car> findByModelYear(String modelYear);

    // fetch cars by model and brand
    List<Car> findByModelAndBrand(String model, String brand);

    // fetch cars by brand or color
    List<Car> findByBrandOrColor(String brand, String color);

    // fetch cars by brand and sorted by year
    List<Car> findByBrandOrderByModelYearAsc(String brand);

    // fetch cars by brand using SQL
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(String brand);
}
