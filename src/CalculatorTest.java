public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();		
		
		testAdd(calc);
		testSubtract(calc);
		testMultiply(calc);
		testDivide(calc);

		System.out.println("✅ 모든 기능 테스트 성공적으로 마침!");
	}

	static void testAdd(Calculator calc) {
		System.out.println("--- [ Add Test ] ---");
		expect(calc.add(3, 5), 8L, "3+5");
       		expect(calc.add(-10, 7), -3L, "-10+7");
     		expect(calc.add(Integer.MAX_VALUE, 1), (long)Integer.MAX_VALUE + 1, "MAX+1");
	}

	static void testSubtract(Calculator calc) {
		System.out.println("--- [ Sudtract Test ] ---");
		expect(calc.subtract(10, 5), 5L, "10-5");
		expect(calc.subtract(5, 10), -5L, "5-10");
	}

	static void testMultiply(Calculator calc) {
		System.out.println("--- [Multiply Test] ---");
		expect(calc.multiply(10, 20), 200L, "10*20");
		expect(calc.multiply(100000, 100000), 10000000000L, "Large Multiplication");
	}

	static void testDivide(Calculator calc) {
		System.out.println("--- [Divide Test] ---");
        	expect(calc.divide(10, 2), 5.0, "10/2");
        	expect(calc.divide(5, 2), 2.5, "5/2");
        	expect(calc.divide(1, 3), 1.0/3.0, "1/3");
		expect(calc.divide(10, 0), 0.0, "Divide by Zero");
	}

	static void expect(long actual, long expected, String name) {
		if (actual == expected) {
			System.out.println("✅ [" + name + "] test success!");
		} else {
			throw new AssertionError("❌ Error : " + name + " / expected = " + expected + ", actual = " + actual);
		}
	}

	static void expect(double actual, double expected, String name) {
		if (actual == expected) {
			System.out.println("✅ [" + name + "] test success!");
		} else {
			throw new AssertionError("❌ Error : " + name + " / expected = " + expected + ", actual = " + actual);
		}
	}
}