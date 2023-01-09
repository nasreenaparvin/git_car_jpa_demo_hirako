package com.axis.carjpademo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.carjpademo.entity.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
