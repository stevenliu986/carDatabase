package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * ClassName: CarRepository
 * Package: com.packt.cardatabase.domain
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 2024/8/20
 */
public interface CarRepository extends CrudRepository<Car, Long> {
}
