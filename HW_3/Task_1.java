package HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Task_1 {
    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел.

        //1) Нужно удалить из него чётные числа
        //2) Найти минимальное значение
        //3) Найти максимальное значение
        //4) Найти среднее ариф. значение
        ArrayList <Integer> aList  = new ArrayList<Integer>(Arrays.asList( 21,5,1,1,7,6,5,-4,0,9,3,-54,5,64));
        int x = MinValues(aList);
        System.out.printf("Минимальное число в списке: %d\n",x);
        System.out.println(Collections.min(aList));

        int y = MaxValue(aList);
        System.out.printf("Максимальное число в списке: %d\n",y);
        System.out.println(Collections.max(aList));

        float z = AvgValue(aList);
        System.out.printf("Среднее значение списка: %.2f\n",z);

        System.out.println(OddNums(aList));
        

    }
    static int MinValues(ArrayList<Integer> al) {
        int min=1000000;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)<min){
                min = al.get(i);
            }
        }
        return min;
    }

    static int MaxValue(ArrayList<Integer> al) {
        int max = 0;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i) > max){
                max = al.get(i);
            }
        }
        return max;
    }

    static float AvgValue(ArrayList<Integer> al){
        float sum=0;
        for (float i : al) {
            sum+=i;
        }
        float avg = sum/al.size();
        return avg;
    }

    static ArrayList<Integer> OddNums(ArrayList<Integer> al){
        al.removeIf(x-> x%2==0);
        return al;
    }
}
