package observer;

public class Main {
	public static void main(String[] args) {
		// ��������
		Observer p1 = new Person1();
		Observer p2 = new Person2();

		// ���Ĳ�Ʊ��
		ObjectFor3D s = new ObjectFor3D();
		s.registerObserver(p1);
		s.registerObserver(p2);

		// ��Ʊ�ŷ�����Ϣ
		s.setMsg("1001");
		//�����
		//����1  �õ���Ʊ����: 1001
		//����2  �õ���Ʊ����: 1001
	}
}
