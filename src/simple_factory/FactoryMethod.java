package simple_factory;

/**
 * ����ģʽ ʵ��
 */
public class FactoryMethod {
	public static void main(String[] args) {
		Driver driver = new BenzDriver();
		Car1 car = driver.getCar();
		car.drive();
	}
}

/**
 * ���ڳ���Ľӿ�
 */
 interface Car1 {
	void drive();
}


////////////////////////��Ʒ��/////////////
 class Benz1 implements Car1 {

	@Override
	public void drive() {
		System.out.println("benz drive");
	}
}

class Audi1 implements Car1 {

	@Override
	public void drive() {
		System.out.println("audi drive");
	}

}

class BMW1 implements Car1 {

	@Override
	public void drive() {
		System.out.println("BMW drive");
	}
}
/////////////////////���󹤳���//////////////////
// ÿһ��ʵ�����Ӧһ������
interface Driver{
	Car1 getCar();
}

class BenzDriver implements Driver{

	@Override
	public Car1 getCar() {
		return new Benz1();
	}
}

class BMWDriver implements Driver{

	@Override
	public Car1 getCar() {
		return new BMW1();
	}
}



class AudiDriver implements Driver{

	@Override
	public Car1 getCar() {
		return new Audi1();
	}
	
}