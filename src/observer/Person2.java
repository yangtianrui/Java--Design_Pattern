package observer;

/**
 * ����1 ע��۲���
 * 
 * @author TerryYang
 *
 */
public class Person2 implements Observer {

	private Observable mSubject;

	// �ڹ��캯����ע��۲���
	public Person2() {
		mSubject = new ObjectFor3D();
		mSubject.registerObserver(this);
	}

	
	
	// �˷������ڱ��۲��ߵ�notifyAll�����б��ص�
	@Override
	public void update(String msg) {
		System.out.println("����2  �õ���Ʊ����: " + msg);
	}

}
