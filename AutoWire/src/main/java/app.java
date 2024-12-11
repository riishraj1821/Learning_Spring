import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Learning_Dependency.Interfaces.car;

public class app {

	public static void main(String[] args) {
//	car swift = new Swift();
//	swift.specs();
//	
//	car corolla = new Corolla();
//	corolla.specs();

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	car myCar = context.getBean("corolla",car.class);
	myCar.specs();
	context.close();
		
	}

}
