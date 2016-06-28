package observer;

/**
 * �����������ʵ��������۲��߽ӿ�
 *
 */
public interface Observable {

	/**
	 * ע��һ���۲���
	 */
	public void registerObserver(Observer observer);

	/**
	 * �Ƴ�һ���۲���
	 */
	public void removeObserver(Observer observer);

	/**
	 * ֪ͨ���й۲���
	 */
	public void notifyObservers();
}
