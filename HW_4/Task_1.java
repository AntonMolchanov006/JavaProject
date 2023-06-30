package HW_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        //Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке 
        //и каждый из их узлов содержит одну цифру.
    //1) Умножьте два числа и верните произведение в виде связанного списка.
    //2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть 
    //отрицательными.

    Deque <Integer> dq = new ArrayDeque <>();
    Deque <Integer> dq1 = new ArrayDeque<>();
    dq.addFirst(1);
    dq.addFirst(2);
    dq.addFirst(3);
    dq1.addFirst(3);
    dq1.addFirst(4);
    dq1.addFirst(5);

    System.out.println(dq);
    System.out.println(dq1);

    int num1 = DqToNum(dq);
    int num2 = DqToNum(dq1);

    LinkedList <Integer> Multi = NumToList(Multiplication(num1, num2));
    LinkedList <Integer> Sum = NumToList(Summ(num1, num2));

    System.out.println(Multi);
    System.out.println(Sum);

    }

    public static int DqToNum(Deque arr){
        int num=0;
        int n = (int)Math.pow(10, arr.size()-1);
        while(n>0){
            num += (int)arr.removeLast()*n;
            n=n/10;
        }
        return num;
    }

    public static LinkedList NumToList(int num){
        LinkedList<Integer> NumList = new LinkedList<Integer>();
        while(num>0){
            NumList.add(0,num%10);
            num=num/10;
        }
        return NumList;
    }

    public static int Multiplication(int a, int b){
        return a*b;
    }

    public static int Summ(int a, int b){
        return a+b;
    }
}
