/*
Возникает ошибка деления на ноль, можно обработать с помощью try/cache,
либо в классе Calculator проверять делитель.
*/

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка\n" + e.getMessage());
        }
    }
}
