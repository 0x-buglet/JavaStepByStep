import java.math.BigDecimal;
import.java.math.RoundingMode;

public class Calculator {
	// [ ver 6 ] BigDecimal을 활용한 십진 연산 구현
	private Calculator() {
		throw new AssertionError("Utility class cannot be instantiated");
	}

	// --- 정수 연산 (성능 우선, 단순 계산용) ---
 
	public static long add(int a, int b) {
		return (long) a + b;
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

	// --- 정밀 연산 (정확도 우선) ---

	public static BigDecimal preciseAdd(String a, String b) {
		return new BigDecimal(a).add(new BigDecimal(b));
	}

	public static BigDecimal preciseSubtract(String a, String b) {
		return new BigDecimal(a).subtract(new BigDecimal(b));
	}

	public static BigDecimal preciseMultiply(String a, String b) {
		return new BigDecimal(a).multiply(new BigDecimal(b));
	}

	/**
	 * @param a 피제수
	 * @param b 제수
	 * @param scale 소수점 자리수
	 * @return 반올림된 결과값
	 */
	public static BigDecimal preciseDivide(String a, String b, int scale) {
		BigDecimal num1 = new BigDecimal(a);
		BigDecimal num2 = new BigDecimal(b);

		if (num2.compareTo(BigDecimal.ZERO) == 0) {
			System.out.println("⚠️ 0으로 나눌 수 없습니다.");
      			return BigDecimal.ZERO;
		}
		return num1.divide(num2, scale, RoundingMode.HALF_UP);
	}
}