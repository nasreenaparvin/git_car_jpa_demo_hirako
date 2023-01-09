package com.axis.carjpademo;



import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.axis.carjpademo.controller.CarController;
import com.axis.carjpademo.service.*;

//Mockito testing
@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.axis.carjpademo.CarJpaDemoApplication.class,webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class CarJpaDemoApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Carservice carService;
	
	@Before
	public void setup() {
		
		CarController controller=new CarController();
		controller.setCarService(carService);
		mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
		
	}
	

	
}
