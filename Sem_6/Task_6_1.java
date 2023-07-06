package Sem_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_6_1 {
    public static void main(String[] args) {
        //1. Напишите метод, который случайным образом заполняет массив из 100 элементов числами от 0 до 50.
        //2. напишите метод, в который передайте вышесозданный массив и с помощью set 
        //   вычислите процент уникальных значений в данном массиве, результат верните числом с 
        //   плавающей запятой.

        ArrayList array = FillArray();
        System.out.println(array);
        System.out.printf("%.2f",PercentUniq(array));


    }

    public static ArrayList <Integer> FillArray(){
        ArrayList <Integer> arr = new ArrayList<Integer>(100);
        Random rnd = new Random();
        for (int i = 0; i < 99; i++) {
            arr.add(rnd.nextInt(0,50));
        }
        return arr;
    }

    public static float PercentUniq(ArrayList <Integer> arr){
        float x;
        Set <Integer> set = new HashSet<Integer>();
        set.addAll(arr);
        x = (float)set.size() * 100/ (float)arr.size();
        
        return x;
    }
}
