package Sem_3;

import java.util.ArrayList;
import java.util.Random;

public class Sem_3_3 {
    public static void main(String[] args) {
        // Заполнить список 10 случайными числами, отсортировать список.

        ArrayList<Integer> intsRand = new ArrayList<Integer>();
        Random rndInt  = new Random();
        for (int i = 0; i < 10; i++) {
            intsRand.add(rndInt.nextInt(100));
        }

        System.out.println(intsRand);

        intsRand.sort(null);

        System.out.println(intsRand);
    }
}
