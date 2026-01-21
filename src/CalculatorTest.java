import java.math.BigDecimal;

public class CalculatorTest {
	public static void main(String[] args) {
		
		testAdd();
		testPreciseAdd();
		testSubtract();
		testMultiply();
		testDivide();

		System.out.println("✅ 모든 기능 테스트 성공적으로 마침!");
	}

	static void testAdd() {
		System.out.println("--- [ Add Test ] ---");
		expect(Calculator.add(3, 5), 8L, "3+5");
       		expect(Calculator.add(-10, 7), -3L, "-10+7");
     		expect(Calculator.add(Integer.MAX_VALUE, 1), (long)Integer.MAX_VALUE + 1, "MAX+1");
	}

	static void testPreciseAdd() {
		System.out.println("--- [Precise Add Test] ---");
		BigDecimal sum = new BigDecimal("0.0");
		for (int i = 0; i < 10; i++) {
			BigDecimal pointOne = new BigDecimal("0.1");
			sum = sum.add(pointOne);
		}
		expect(sum.doubleValue(), 1.0, "BigDecimal 0.1*10");
	}

	static void testSubtract() {
		System.out.println("--- [ Subtract Test ] ---");
		expect(Calculator.subtract(10, 5), 5L, "10-5");
		expect(Calculator.subtract(5, 10), -5L, "5-10");
	}

	static void testMultiply() {
		System.out.println("--- [Multiply Test] ---");
		expect(Calculator.multiply(10, 20), 200L, "10*20");
		expect(Calculator.multiply(100000, 100000), 10000000000L, "Large Multiplication");
	}

	static void testDivide() {
		System.out.println("--- [Divide Test] ---");
        	expect(Calculator.divide(10, 2), 5.0, "10/2");
        	expect(Calculator.divide(5, 2), 2.5, "5/2");
        	expect(Calculator.divide(1, 3), 1.0/3.0, "1/3");
		expect(Calculator.divide(10, 0), 0.0, "Divide by Zero");
	}

	static void expect(long actual, long expected, String name) {
		if (actual != expected) {
			throw new AssertionError("❌ Error : " + name + " / expected = " + expected + ", actual = " + actual);
		}
		System.out.println("✅ [" + name + "] test success!");
	}

	static void expect(double actual, double expected, String name) {
		if (actual != expected) {
			throw new AssertionError("❌ Error : " + name + " / expected = " + expected + ", actual = " + actual);
		}
		System.out.println("✅ [" + name + "] test success!");
	}
}