package Sem_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_4_4 {
    public static void main(String[] args) {
        // Написать метод, который принимает на вход массив элементов, помещает их в стэк
        //и выводит на консоль содержимое стэка
        ArrayList <Object> al = new ArrayList<>(Arrays.asList(3,6,"df",78,123));
        ArrayToStack(al);
        ArrayToQueue(al);

    }

    static void ArrayToStack(ArrayList al){
        Stack <Object> st = new Stack<>();
        for (Object object : al) {
            st.push(object);
        }
        System.out.println(st);
    }

    static void ArrayToQueue(ArrayList al){
        Queue <Object> ql = new LinkedList<>();
        for (Object object : al) {
            ql.add(object);
        }
        System.out.println(ql);
    }
}
