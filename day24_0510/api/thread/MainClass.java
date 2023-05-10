package day24_0510.api.thread;

public class MainClass {

	public static void main(String[] args) {

		// 1. 작업 쓰레드로 사용 할 객체를 생성
		ThreadTest t = new ThreadTest();
		
		// 2. 쓰레드 클래스를 사용해서 작업 쓰레드를 실행
		Thread thread = new Thread(t, "Thread A");
		thread.start();
		
		// 일시적으로 쓰레드 멈춤
		try {
			Thread.sleep(5000);	// 5초간 멈춤
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
		
		
		
		
		
		
	}

}
