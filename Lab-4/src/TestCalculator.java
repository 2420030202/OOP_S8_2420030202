import Mypackage.Calculator;
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(59, 10);
        int diff = calc.subtract(100, 31);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}