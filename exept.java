import java.util.Scanner;

public class exept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Введите первое целое число: ");
            int dividend = scanner.nextInt();
            System.out.print("Введите второе целое число: ");
            int divisor = scanner.nextInt();
            int result = divide(dividend, divisor);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль не имеет смысла!");
        }
    }
    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль не разрешено");
        }
        return dividend / divisor;
    }
}
