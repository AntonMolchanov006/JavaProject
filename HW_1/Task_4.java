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

        System.out.println(index1);

    }
}
