package simple_factory;

public class Main {
	public static void main(String[] args) throws Exception {
		Car car = CarFactory.driveCar("Benz");
		car.drive();
	}
}

/**
 * ���ڳ���Ľӿ�
 */
interface Car {
	void drive();
}


////////////////////////��Ʒ��/////////////
class Benz implements Car {

	@Override
	public void drive() {
		System.out.println("benz drive");
	}
}

class Audi implements Car {

	@Override
	public void drive() {
		System.out.println("audi drive");
	}

}

class BMW implements Car {

	@Override
	public void drive() {
		System.out.println("BMW drive");
	}
}
///////////////////////////////////////////
/**
 * ������
 */
class CarFactory {
	public static Car driveCar(String s) throws Exception {
		// ���ݲ���������ͬ�Ķ���
		if (s.equals("Benz")) {
			return new Benz();
		} else if (s.equals("Audi")) {
			return new Audi();
		} else if (s.equals("BMW")) {
			return new BMW();
		} else {
			// û�ж�Ӧ�Ķ���ʱ���׳��쳣
			throw new Exception();
		}
	}
}
