package cn.liu;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		System.out.println("������Ҫת�����¶ȣ���λ�����϶ȣ�");
		Scanner in = new Scanner(System.in);
		double centigrade = in.nextDouble();
		TemperatureConverter tc = new TemperatureConverter();
		double fahrenheit = tc.toFahrenheit(centigrade);
		System.out.println("ת����ɵ��¶ȣ���λ�����϶�)"+fahrenheit);
		in.close();
	}

	private double toFahrenheit(double centigrade) {
		double fahrenheit =1.8*centigrade+32;
		return fahrenheit;
	}
	
	

}
