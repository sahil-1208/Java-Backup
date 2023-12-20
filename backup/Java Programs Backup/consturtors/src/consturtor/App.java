package consturtor;

public class App {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		Controller controller = new Controller(service);
		controller.show();
	}

}

abstract class Service {

	public abstract void prepare();
}

class ServiceImpl extends Service {

	@Override
	public void prepare() {
		System.out.println("make Engineers");
	}

}

class Controller {
	private Service service;

	public Controller(Service service) {
		this.service = service;
	}

	public void show() {

		service.prepare();

	}
}
