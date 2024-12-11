package Car;

import org.springframework.stereotype.Component;

import Interface.Car;
@Component("swift")
public class Swift implements Car {
	@Override
	public void specs() {
		System.out.println("Swift is a compact Car");

	}

}
