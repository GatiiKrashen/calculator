package ru.krista.example;

import java.util.Scanner;

public class Calculator {
    // Scanner in = new Scanner(System.in);
    int num1;
    int num2;
    String operation;
    int result;

    public Calculator() {
        num1 = 0;
        num2 = 0;
    }

    // метод ввода
    public void getEnter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор: ");
        System.out.println("Введите 1 число, знак операции, 2 число через пробелы");
        String str = in.nextLine();
        in.close();
        String[] parts = str.split(" ");
        try {

            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
            operation = parts[1];

        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + str);
            System.exit(1);
        }
    }

    // сумма
    public int sum() {
        return num1 + num2;
        // break;
    }

    // разность
    public int dif() {
        return num1 - num2;
        // break;
    }

    // деление
    public int div() {
        if (num2 == 0) {
            System.out.println("На ноль делить нельзя");
            System.exit(1);
        }
        return num1 / num2;
        // break;
    }

    // умножение
    public int mul() {
        return num1 * num2;
        // break;
    }

    public void cals() {

        switch (operation) {
            case "+":
                result = sum();
                break;
            case "-":
                result = dif();
                break;
            case "*":
                result = mul();
                break;
            case "/":
                result = div();
                break;

            default:
                System.out.println("Не обнаружен знак операции ");
                break;
        }
        System.out.println("Резульат: " + result);

    }

}
