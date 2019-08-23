package thread;

public class MultiThreadEx03 {

	public static void main(String[] args) {
		Thread t1 = new DigitThread();
		Thread t2 = new AlphabetThread();
		Thread t3 = new Thread(new UpperCaseAlphabetRunableImpl());//Runable인터페이스를 구현한 클래스를 넣는다.
		
		t1.start();
		t2.start();
		t3.start();
	}

}
