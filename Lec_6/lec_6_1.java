package Lec_6;

import java.util.Arrays;
import java.util.HashSet;

public class lec_6_1 {
    public static void main(String[] args) {
        lection_6 w1 = new lection_6();
        w1.firstName = "Anton";
        w1.lastName = "Molchanov";
        w1.Salary = 100000;
        w1.Id = 123;

        lection_6 w4 = new lection_6();
        w4.firstName = "Anton";
        w4.lastName = "Molchanov";
        w4.Salary = 100000;
        w4.Id = 123;

        lection_6 w2 = new lection_6();
        w2.firstName = "Anton_2";
        w2.lastName = "Molchanov_2";
        w2.Salary = 200000;
        w2.Id = 223;

        lection_6 w3 = new lection_6();
        w3.firstName = "Anton_3";
        w3.lastName = "Molchanov_3";
        w3.Salary = 300000;
        w3.Id = 323;

        System.out.println(w1==w4);
        System.out.println(w1.equals(w4));

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        var workers = new HashSet<lection_6>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

    }
}
