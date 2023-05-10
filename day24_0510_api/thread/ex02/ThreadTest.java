package day24_0510_api.thread.ex02;

public class ThreadTest implements Runnable{

	private int num = 0;
	
	@Override
	// public void run() { 동기화 전 코드
	public synchronized void run() {	// 동기화 후 코드
	
		for(int i = 1; i <= 10; i++) {
			
			num++;
			
			System.out.println("========================");
			System.out.println("쓰레드명 : " + Thread.currentThread().getName()); // 현재 쓰레드 이름
			System.out.println(num);
			
			try {
				Thread.sleep(1000);	//1초
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
