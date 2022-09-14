import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String welcom = "Калькулятор ";
        Integer calculatorNumber = 3000;
        String developer = "Анатолий Сорокин";
        System.out.println(welcom + calculatorNumber + " by " + developer);


        // Calculator
        while (true) {
            Scanner scanner = new Scanner(System.in);
                System.out.println("Введите первое число:");
                double firstNumber = new Scanner(System.in).nextDouble();
                System.out.println("Выберите действие: ");
                System.out.println("1.Сложение");
                System.out.println("2.Вычетание");
                System.out.println("3.Деление");
                System.out.println("4.Умножение");
                int choice = scanner.nextInt();
                if (choice < 1) {
                System.out.println("Error! Выберите верный пункт!");
                System.out.println("Перезапустите программу, чтобы продолжить!");
                break;
                }
                if (choice > 4) {
                    System.out.println("Error! Выберите верный пункт!");
                    System.out.println("Перезапустите программу, чтобы продолжить!");
                    break;
                }
                System.out.println("Введите второе число:");
                double secondNumber = new Scanner(System.in).nextDouble();


                if (choice == 1) {
                    System.out.println("Сумма " + firstNumber + " + " + secondNumber + " = "
                            + (firstNumber + secondNumber));
                }
                if (choice == 2) {
                    System.out.println("Разность " + firstNumber + " - " + secondNumber + " = "
                            + (firstNumber - secondNumber));
                }
                if (choice == 3) {
                    if (secondNumber == 0) {
                        System.out.println("Error! На ноль делить нельзя!");
                        System.out.println("Перезапустите программу, чтобы продолжить!");
                        break;
                    }
                    System.out.println("Частное " + firstNumber + " / " + secondNumber + " = "
                            + (firstNumber / secondNumber));
                }
                if (choice == 4) {
                    System.out.println("Произведение " + firstNumber + " * " + secondNumber + " = "
                            + (firstNumber * secondNumber));
                } else  {
                        System.out.println("Программа завершена!");
                        System.out.println("Перезапустите программу, чтобы продолжить!");
                        break;
                }

        }
    }

}





