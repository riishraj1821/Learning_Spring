package Learning_Dependency.Car;

import org.springframework.stereotype.Component;

import Learning_Dependency.Interfaces.car;
@Component("swift")
public class Swift implements car {

	@Override
	public void specs() {
		System.out.println("Hatchback From suzuki");

	}

}
