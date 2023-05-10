package day24_0510.api.thread;

public class ThreadTest implements Runnable{	// 초상위 인터페이스

	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("작업 쓰레드에서 실행된 for문 : " + i);
			System.out.println("쓰레드의 이름 : ");
			
			// 일시적으로 쓰레드 멈춤
			try {
				Thread.sleep(1000);	// 1초간 멈춤
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}
	
}
