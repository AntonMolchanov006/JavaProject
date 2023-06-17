package Sem_2;

import java.util.Scanner;

public class Sem_2_1 {
    public static void main(String[] args) {
        // Напишите метод, который будет сжимать строку.
        // aaaabbbccd
        // 4a3b2cd

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 1;
        String newStr = "";

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if(count == 1){
                    newStr = newStr + str.charAt(i-1);
                }
                else{
                    newStr = newStr + count + str.charAt(i-1);
                    count= 1;
                }
                
            } 
            if(i == str.length()-1){
                if(count == 1){
                    newStr= newStr+ str.charAt(str.length()-1);
                }
                else{
                    newStr= newStr + count + str.charAt(str.length()-1);
                }
                
            }
            
        }
        System.out.println(newStr);

    }
}
