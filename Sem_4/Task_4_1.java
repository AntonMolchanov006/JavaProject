package Sem_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task_4_1 {
    public static void main(String[] args) {
        //Замерьте, за какое время добавятся 100000 элементов в ArrayList
        //Замерьте, за какое время добавятся 100000 элементов в LinkedList
        // Сравните время.

        ArrayList <Integer> al = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            al.add(0,i);
        }
        long finish = System.currentTimeMillis() - start;

        LinkedList <Integer> ll = new LinkedList<>();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ll.add(0,i);
        }
        long finish1 = System.currentTimeMillis()-start1;

        System.out.println(finish);
        System.out.println(finish1);
    }
}
