package Lec_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lec_4 {
    public static void main(String[] args) {
        // Двусвязные списки

        LinkedList <Integer> ll = new LinkedList<>();
        
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);

        // Очередь Queue - обработка данных происходит по очереди, начиная с элемента, 
        //добавленного первым, затем второй и т.д.

        Queue <Integer> ql = new LinkedList<Integer>();

        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        
        int item = ql.remove(); // удаление элемента, добавленным первым.
        System.out.println(item);

        System.out.println(ql);

        // Priority Queue - наименьший элемент имеет наивысший приоритет.

        PriorityQueue <Integer> pq = new PriorityQueue<Integer>();

        pq.add(123);
        pq.add(13);
        pq.add(23);
        pq.add(1);

        System.out.println(pq);

        // Deque = double ended queue - линейная коллекция, которая проддерживает 
        //вставку и удаление данных с обоих концов.

        Deque <Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(1);
        dq.addLast(2);

        dq.removeLast();
        dq.removeLast();

        dq.offerFirst(1);
        dq.offerLast(2);

        dq.pollFirst();
        dq.pollLast();

        // dq.getFirst();
        // dq.getLast();

        dq.peekFirst();
        dq.peekLast();




    }
}
