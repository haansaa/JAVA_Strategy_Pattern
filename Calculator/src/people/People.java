package people;

import Calculator.Calculator;

public class People {
	private Calculator calculator;
	private double n1;
	private double n2;
	
	public double operate() {
		return calculator.execute(n1, n2);
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void changeNumber(double n1, double n2) {
		// public 설정 안하면 메인에서 함수 못 불러옴
		this.n1 = n1;
		this.n2 = n2;
	}
}
