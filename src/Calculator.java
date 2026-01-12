public class Calculator {
	// [ ver 1 ] 더하기 기능만 존재
	// (long) 사용해 overflow 방지하는 방어 로직
	public long add(int a, int b) {
		return (long) a + b;
	}
}