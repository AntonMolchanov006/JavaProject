package HW_2;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.sound.midi.MidiDevice.Info;

public class Task_2 {
    public static void main(String[] args) {
        //Реализуйте алгоритм сортировки пузырьком числового массива, 
        //результат после каждой итерации запишите в лог-файл.

        int [] arr = {3,4,9,6,7,0,2,8,1,5};
        int temp;
        String logger = "";
        
        java.util.Date date = new java.util.Date();
        

        try{
            FileWriter fw = new FileWriter("HW_2//log.txt", true);
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        logger = date + " index of element " + arr[j] + " became " + (j+1);
                        fw.write(logger + "\n");
                    }
                }
            }
            fw.close();
        }
        catch(Exception e){
            System.out.println("Ошибка!!");
        }
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
