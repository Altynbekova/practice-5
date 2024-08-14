import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 1ое число:");
        int a = scanner.nextInt();
        System.out.println("Введи 2ое число:");
        int b = scanner.nextInt();
        System.out.println("Введи 3е число:");
        int c = scanner.nextInt();

        System.out.println("Выбери действие:");
        System.out.println("1 - найти сумму чисел");
        System.out.println("2 - найти произведение чисел");

        int option = scanner.nextInt();
        int result;

        if (option == 1) {
            result = a + b + c;
            System.out.println("Сумма чисел - " + result);
        } else{
            result = ;
            System.out.println("Произведение чисел - " + result);
        }

    }
}
