import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    Scanner scanner = new Scanner(System.in);

    /**
     * Метод main, точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {


        ViewCalculator view = new ViewCalculator();
        Calculator calculator = new Calculator();
        int choice = 0;
        while (choice != 4) {
            // Вывод меню на экран и получение выбора пользователя
            view.showMenu();
            choice = view.getMenuChoice();

            // Выбор операции в зависимости от выбора пользователя
            switch (choice) {
                case 1:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // сложения
                    ComplexNum num1 = view.getComplexNumber();
                    ComplexNum num2 = view.getComplexNumber();
                    calculator.setOperation(new Logger(OperationGenerator.createOperation("addition")));
                    ComplexNum sum = calculator.execute(num1, num2);
                    break;
                case 2:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // деления
                    ComplexNum num3 = view.getComplexNumber();
                    ComplexNum num4 = view.getComplexNumber();
                    calculator.setOperation(new Logger(OperationGenerator.createOperation("division")));
                    ComplexNum div = calculator.execute(num3, num4);
                    break;
                case 3:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // умножения
                    ComplexNum num5 = view.getComplexNumber();
                    ComplexNum num6 = view.getComplexNumber();
                    calculator.setOperation(new Logger(OperationGenerator.createOperation("multiplication")));
                    ComplexNum product = calculator.execute(num5, num6);
                    break;
                case 4:
                    // Вывод сообщения о выходе из программы
                    System.out.println("Выход");
                    break;
                default:
                    // Вывод сообщения об ошибке при некорректном выборе пользователя
                    System.out.println("Некорректный выбор");
            }
        }
    }
}

