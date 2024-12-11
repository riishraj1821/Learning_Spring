package Learning_Dependency.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Learning_Dependency.Interfaces.car;
@Component("corolla")
public class Corolla implements car {
	
	@Autowired(required = false)
	Engine engine;

	@Override
	public void specs() {
		System.out.println("sedan From toyota with Engine as " + engine.type);

	}

}
