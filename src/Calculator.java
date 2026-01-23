import java.math.BigDecimal;

public class Calculator {
	// [ ver 5 ] stateless 유틸리티 클래스 설계
	private Calculator() {
	
	}
 
	public static long add(int a, int b) {
		return (long) a + b;
	}

	public static BigDecimal preciseAdd(String a, String b) {
		BigDecimal num1 = new BigDecimal(a);
		BigDecimal num2 = new BigDecimal(b);
		return num1.add(num2);
	}
	
	public static long subtract(int a, int b) {
		return (long) a - b;
	}

	public static long multiply(int a, int b) {
		return (long) a * b;
	}

	public static double divide(int a, int b) {
		// [ 가드 절 ] 나누는 수가 0이면 미리 처리하기
		if (b == 0) {
			System.out.println("⚠️ 0으로 나눌 수 없습니다.");
			return 0.0;
		}
		return (double) a / b;
	}
}