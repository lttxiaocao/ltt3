package cn.liu;

public class OverloadingTest {
	
	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		ot.info();
		ot.info(5);
	}

	private void info() {
		System.out.println("������");
		
	}

	private void info(int i) {
		System.out.println(i+"����");
		
	}

}
