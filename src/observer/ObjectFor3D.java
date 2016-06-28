package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲��ߵ�ʵ����
 * 
 * @author TerryYang
 *
 */
public class ObjectFor3D implements Observable {

	// ����ע���ڴ˵Ĺ۲���
	private List<Observer> mObservers = new ArrayList<>();

	// 3D��Ʊ����
	private String mMsg;

	@Override
	public void registerObserver(Observer observer) {
		mObservers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		mObservers.remove(observer);

	}

	// ֪ͨ���й۲���
	@Override
	public void notifyObservers() {
		for (Observer o : mObservers) {
			o.update(mMsg);
		}
	}

	// ������Ʊ��
	public void setMsg(String msg) {
		mMsg = msg;
		notifyObservers();
	}

}
