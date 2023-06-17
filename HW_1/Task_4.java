package HW_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
        //Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
        //Требуется восстановить выражение до верного равенства. 
        //Предложить хотя бы одно решение или сообщить, что его нет.
        //Под знаком вопроса - одинаковые цифры
        //Введите уравнение: ?? + ?? = 44
        //Ответ: 22 + 22 = 44

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String equation = sc.nextLine();

        int index1 = equation.indexOf("+");
        int index2 = equation.indexOf("=");
        String firstNum = equation.substring(0, index1);
        String secondNum  = equation.substring(index1+1, index2);
        String result = equation.substring(index2+1);
        boolean flag = false;
        
        for (int i = 0; i < 10; i++) {
            String n = Integer.toString(i);
            int N1 = Integer.parseInt(firstNum.replace("?", n));
            int N2 = Integer.parseInt(secondNum.replace("?", n));
            int N3 = Integer.parseInt(result);
            if((N1+N2) == N3){
                System.out.printf("%d+%d=%d", N1,N2,N3);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Решения нет.");
        }
    }
}
