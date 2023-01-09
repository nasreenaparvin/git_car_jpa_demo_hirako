package com.axis.carjpademo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.carjpademo.entity.Car;
import com.axis.carjpademo.service.Carservice;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CarController {
	
	
	@Autowired
	private Carservice carService;
	
    public CarController() {
		
	}
	
	public Carservice getCarService() {
		return carService;
	}

	public void setCarService(Carservice carService) {
		this.carService = carService;
	}

	@GetMapping("/cars")
	public List<Car> getAllCars(){
		return carService.getAllCars();
	}
	
	@GetMapping("/car/{engineNumber}")
	public Car getcarByEngineNumber(@PathVariable long engineNumber) {
		return carService.getCarByEngineNumber(engineNumber);
	}
	
	@PostMapping("/car")
	public ResponseEntity<String> saveCar(@RequestBody Car car){
		carService.saveCar(car);
		return new ResponseEntity<String>("car added to db...",HttpStatus.CREATED);
		
	}
	@DeleteMapping("/car/{engineNumber}")
	public ResponseEntity<String> deleteCarByEngineNumber(@PathVariable long engineNumber){
		carService.deleteCarByEngineNumber(engineNumber);
		return new ResponseEntity<String>("car with engine number is deleted from db...",HttpStatus.OK);
	}
	


}
	