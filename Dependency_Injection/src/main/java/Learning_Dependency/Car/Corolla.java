package Learning_Dependency.Car;

import org.springframework.stereotype.Component;

import Learning_Dependency.Interfaces.car;
@Component("corolla")
public class Corolla implements car {

	@Override
	public void specs() {
		System.out.println("sedan From toyota");

	}

}
