public class Calculator {
	// [ ver 3 ] 뺄셈, 곱셈 기능 추가
	public long add(int a, int b) {
		return (long) a + b;
	}
	
	public long subtract(int a, int b) {
		return (long) a - b;
	}

	public long multiply(int a, int b) {
		return (long) a * b;
	}

	public double divide(int a, int b) {
		// [ 가드 절 ] 나누는 수가 0이면 미리 처리하기
		if (b == 0) {
			System.out.println("⚠️ 0으로 나눌 수 없습니다.");
			return 0.0;
		}
		return (double) a / b;
	}
}