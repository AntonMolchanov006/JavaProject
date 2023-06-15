package HW_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = sc.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            sum+=i;
            factorial*=i;
        }
        System.out.println("Сумма чисел от 1 до n равна: " + sum);
        System.out.println("Факториал числа n равен: " + factorial);

    }
}
