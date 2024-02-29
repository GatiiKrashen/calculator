package ru.krista.example;

import java.util.Scanner;

/* v*/
public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            int num1;
            int num2;
            int result;

            System.out.println("Калькулятор: ");
            System.out.println("Введите 1 число, знак операции, 2 число через пробелы");
            String str = in.nextLine();
            in.close();

            String[] parts = str.split(" ");
            try {

                num1 = Integer.parseInt(parts[0]);
                num2 = Integer.parseInt(parts[2]);

            } catch (NumberFormatException e) {
                System.out.println("Не удалось получить число из: " + str);
                return;
            }
            switch (parts[1]) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Резульат: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Резульат: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Резульат: " + result);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("На ноль делить нельзя");
                        return;
                    }
                    result = num1 / num2;
                    System.out.println("Резульат: " + result);
                    break;
                default:
                    System.out.println("Не обнаружен знак операции ");
                    break;
            }

        }
    }
}
