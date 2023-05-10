package day24_0510.api.thread;

public class MainClass02 {

	public static void main(String[] args) {

		// 쓰레드를 상속 받은 클래스는 직접 사용
		ThreadTest02 t = new ThreadTest02();
		
		// 쓰레드명
		t.setName("Thread_B");
		t.start();
		
		try {
			t.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
	}

}
