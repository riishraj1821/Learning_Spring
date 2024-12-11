package Pratice_01.car;

import org.springframework.stereotype.Component;

import Pratice_01.Interface.Car;
@Component
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Swift is my dream Car");

	}

}
