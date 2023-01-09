package com.axis.carjpademo.service;

import java.util.List;

import com.axis.carjpademo.entity.Car;

public interface Carservice {
	//some methods to access db
	Car getCarByEngineNumber(long engineNumber);
	List<Car> getAllCars();
	void saveCar(Car car);
	void updateCar(long engineNumber,Car updatedCar);
	void deleteCarByEngineNumber(long engineNumber);
	

}
