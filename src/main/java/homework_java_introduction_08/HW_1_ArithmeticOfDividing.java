package homework_java_introduction_08;

import java.util.Scanner;

public class HW_1_ArithmeticOfDividing {


    public static double div(double operand_1, double operand_2) {
        if (operand_2 == 0) {
            throw new ArithmeticException("Операція ділення на 0 не можлива");
        }
        return operand_1 / operand_2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введіть перший операнд");
            double op1 = scanner.nextDouble();
            System.out.println("Введіть другий операнд");
            double op2 = scanner.nextDouble();
            double getResMetDiv = div(op1, op2);
            System.out.println("Результат ділення: " + getResMetDiv);
        } catch (ArithmeticException exception) {
            System.err.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
