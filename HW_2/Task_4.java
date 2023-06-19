package HW_2;

import java.io.FileWriter;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        try{
            FileWriter calcLog = new FileWriter("HW_2//CalcLog.txt",true);

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
                    calcLog.write(date + " " + num1 + " + " + num2 + " = " + result + "\n");
                    break;
                case "-": result=num1-num2;
                    calcLog.write(date + " " + num1 + " - " + num2 + " = " + result + "\n");
                    break;
                case "*": result = num1*num2;
                    calcLog.write(date + " " + num1 + " * " + num2 + " = " + result + "\n");
                    break;
                case "/": result = num1/num2;
                    calcLog.write(date + " " + num1 + " / " + num2 + " = " + result + "\n");
                    break;
                default: result = 0;
            }
            
            System.out.println("ответ: " + result);

            sc.close();
            calcLog.close();
        }
        catch(Exception e){
            System.out.println("ОШИБКА!!!");
        }
        
        
    }
}
