package homework_java_introduction_03;

import java.util.ArrayList;
import java.util.List;

import static homework_java_introduction_03.DigitSumCalculator.calculateDigitSum;
import static homework_java_introduction_03.MathOperations.*;
import static homework_java_introduction_03.TemperatureConverter.fahrenheitToCelsius;

public class Main {


    public static void main(String[] args) {

        BankAccount AntonbankAccount = new BankAccount("1234123412341234", 999999.99);
        BankAccount OlhabankAccount = new BankAccount("4149234523452345", 1999999.99);

        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(AntonbankAccount);
        bankAccounts.add(OlhabankAccount);

        System.out.println(bankAccounts);

        System.out.println("-".repeat(80));

        int temperature = 100;

        System.out.println(temperature + "°F (Фаренгейти)" + " при переведенні у Цельсії становитиме: " + fahrenheitToCelsius(temperature) + "°C");

        System.out.println("-".repeat(80));

        double inputNumber = 7.0;

        System.out.println("Корінь з число " + inputNumber + " становитиме: " + calculateSquareRoot(inputNumber));
        System.out.println("Число " + inputNumber + " в Квадраті становитиме: " + calculateSquare(inputNumber));
        System.out.println("Число " + inputNumber + " в Кубі становитиме: " + calculateCube(inputNumber));

        System.out.println("-".repeat(80));

        int numberForDigitCalc = 951;

        System.out.println("Число " + numberForDigitCalc + " сума членів кожного становить " + calculateDigitSum(numberForDigitCalc));

    }


}
