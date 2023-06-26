package Sem_4;

import java.util.Scanner;
import java.util.Stack;

public class Task_4_3 {
    public static void main(String[] args) {
        //Реализовать консольное приложение, которое:

        // 1. Принимает от пользователя и "запоминает" строки.
        // 2. Если введено print, выводит строки так, чтобы первой выводилась последняя введнныя строка,
        // а последней выводилась первая введенная строка.

        Scanner sc = new Scanner(System.in);
        String enter;
        boolean exit = true;
        Stack <String> stList = new Stack<>();
        while(exit){
            enter = sc.nextLine();
            if(enter.equals("print")){
                while(!stList.empty())
                System.out.println(stList.pop());
                exit = false;
                
            }
            else{
                stList.add(enter);
                System.out.println(stList);
            }
        }
    }
}
