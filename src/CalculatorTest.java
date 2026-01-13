public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();		

		expect(calc.add(3, 5), 8L, "3+5");
		expect(calc.add(-10, 7), -3L, "-10+7");
		expect(calc.add(0, 0), 0L, "0+0");
		expect(calc.add(Integer.MAX_VALUE, 1), (long)Integer.MAX_VALUE + 1, "MAX+1");
	}

	static void expect(long actual, long expected, String name) {
		if (actual == expected) {
			System.out.println("✅ [" + name + "] test success!");
		} else {
			throw new AssertionError("❌ Error : " + name + " / expected = " + expected + ", actual = " + actual);
		}
	}
}