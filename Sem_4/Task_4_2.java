package Sem_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        //Реализовать консольное приложение, которое:
        //1. Принимает от пользователя строку вида
        //    text
        // 1. Нужно сохранить text в связный список.
        // 2. Если введенно print~num, выводит строку из позиции num и удаляет ее из списка.

        LinkedList <String> anyList = new LinkedList<>(); 
        boolean exit = true;
        String enter;
        while(exit){
            System.out.println("Введите строку: ");
            Scanner sc = new Scanner(System.in);
            enter = sc.nextLine();
        
            if(enter.startsWith("print~", 0)){
                int index =  Integer.parseInt(enter.substring(6));
                System.out.println(anyList.remove(index));
            }
            else if(enter.equals("exit")){
                exit = false;
            }
            else{
                anyList.add(enter);
            }
            System.out.println(anyList);
        }
    }
}
