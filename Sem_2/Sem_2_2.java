package Sem_2;

import java.io.FileWriter;

public class Sem_2_2 {
    public static void main(String[] args) {
        // Записать в файл 10 раз слово тест

        int n = 10;
        String str = "TEST";

        try{
        FileWriter file = new FileWriter("test.txt");
        for (int i = 0; i < n; i++) {
            file.write(str+"\n");
        }
        file.close();
        System.out.println("OK");
        }
        catch(Exception e){
            System.out.println("что-то пошло не так.");
        }
        
    }
}
