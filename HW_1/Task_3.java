package HW_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.print("Введите математическое действие (+,-,*,/): ");
        String action = sc.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println();
        int result=0;

        switch(action){
            case "+": result=num1+num2;
                break;
            case "-": result=num1-num2;
                break;
            case "*": result = num1*num2;
                break;
            case "/": result = num1/num2;
                break;
            default: result = 0;
        }
        System.out.println("ответ: " + result);
    }
}
