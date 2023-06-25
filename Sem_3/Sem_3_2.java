package Sem_3;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Sem_3_2 {
    public static void main(String[] args) throws IOException {
        //Создать список типа ArrayList, заполнить его как строками так и целыми числами.
        // удалить из списка цедлые числа.

        ArrayList different = new ArrayList<>();
        different.add(3);
        different.add("e");
        different.add(9);
        different.add("876");
        different.add("p");
        different.add(123);
        different.add(876);
        different.add("k");

        // for (int i = 0; i < different.size(); i++) {
        //     if(different.get(i) instanceof Integer){
        //         different.remove(i);
        //         i--;
        //     }
        // }

        java.util.Iterator iter = different.iterator();
        while(iter.hasNext()){
            if (iter.next() instanceof Integer){
                iter.remove();
            }
        }

        
            System.out.println(different);
            
        
    }
}
