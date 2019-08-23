package thread;

public class MultiThreadEx02 {

	public static void main(String[] args) {
		Thread t1 =new DigitThread();
		Thread t2 =new AlphabetThread();
		t1.start();
		t2.start();
		//메인은 쓰레드만 실행시키고 종료
	}

}
