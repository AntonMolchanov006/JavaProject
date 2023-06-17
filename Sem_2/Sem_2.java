package Sem_2;

import java.util.Scanner;

public class Sem_2 {
    public static void main(String[] args) {
        // Дано четное число N (>0) и символы с1 и с2.
        // Написать метод, который вернет строку длины N, которая состоит из чередующихся с1 и с2
        // начиная с с1.

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину строки: ");
        int N = sc.nextInt();
        System.out.print("Введите первый символ: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Введите первый символ: ");
        char c2 = sc.next().charAt(0);

        String str = "";
        boolean flag = true;
        while(N>0){
            
            if(flag){
                str = str + c1;
                flag = false;
            }
            else{
                str = str + c2;
                flag = true;
            }
            N--;
        }
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < N/2; i++) {
            sb.append(c1+c2);
        }
        System.out.println(sb);
    }
}
