package Sem_5;

import java.util.HashMap;
import java.util.Map;

public class Task_5_2 {
    public static void main(String[] args) {
        // Даны 2 строки, написатть метод, который возвращает true, 
        //если эти строки являются изоморфными, false, если нет.

        String s = "foo";
        String t = "bar";
        String a = "paper";
        String b = "title";

        System.out.println(Isomorph("note", "code"));
    }

    public static boolean Isomorph(String str1, String str2){
        boolean flag = true;
        if(str1.length()!=str2.length()) flag = false;
        Map <Character, Character> Code = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if(Code.containsKey(str1.charAt(i))){
                if(str2.charAt(i) != Code.get(str1.charAt(i))) flag = false;
            }else Code.put(str1.charAt(i), str2.charAt(i));
        }
        return flag;
    }
}
