import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Pratice_01.Interface.Car;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean(Car.class);
		myCar.specs();
		context.close();
	}

}
