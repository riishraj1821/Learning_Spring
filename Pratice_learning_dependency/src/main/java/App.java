import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Car.Swift;
import Interface.Car;

public class App {

	public static void main(String[] args) {
//	 Car swift = new Swift();
//	 Car corolla = new Swift();
//	 
//	 swift.specs();
//	 corolla.specs();
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Car myCar = context.getBean("swift",Car.class);
	myCar.specs();
	context.close();
	}

}
