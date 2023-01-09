package com.axis.carjpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.carjpademo.entity.Car;
import com.axis.carjpademo.exception.CarNotFoundException;
import com.axis.carjpademo.repository.CarRepository;

@Service
public class CarServiceImpl implements Carservice{
	
	//Spring JPA frame work will create object
	//and assign to car repository interface
	@Autowired
	private CarRepository carRepository;

	@Override
	public Car getCarByEngineNumber(long engineNumber) {
		Optional<Car> carOpt=carRepository.findById(engineNumber);
		if(!carOpt.isPresent())
			throw new CarNotFoundException("car is not found with engine number "+engineNumber);
		return carOpt.get();
	}

	@Override
	public List<Car> getAllCars() {
		
		return (List<Car>) carRepository.findAll();
	}

	@Override
	public void saveCar(Car car) {
		carRepository.save(car);
		
	}

	@Override
	public void updateCar(long engineNumber, Car updatedCar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCarByEngineNumber(long engineNumber) {
		carRepository.deleteById(engineNumber);
		
	}

}
