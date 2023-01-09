package com.axis.carjpademo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//controller advice->global exception calss which handles all exception
@ControllerAdvice
public class GlobalCarException {
	
	//individual exception handlers
	
	@ExceptionHandler(value=CarNotFoundException.class)
	public ResponseEntity<String> carNotFoundExceptionHandler(CarNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

}
