package Sem_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task_5_3 {
    public static void main(String[] args) {
        //Напишите программу, проверяющую правильность расстановки скобок в выражении.

        //Пример: [f+(3*b)] true
        String str = "f3{*b}";
        String str1 = "[f+(3*b]";
        String str2 = "[f+3*b)]";

        System.out.println(Skobki(str));
        System.out.println(Skobki(str1));
        System.out.println(Skobki(str2));


    }

    public static boolean Skobki(String word){
        Map <Character, Character> dict = new HashMap<>();
        dict.put(')', '(');
        dict.put(']', '[');
        dict.put('}', '{');
        dict.put('>', '<');
        Stack <Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            if(dict.containsValue(word.charAt(i))){
                stack.push(word.charAt(i));
            } else if(dict.containsKey(word.charAt(i))){
                if(stack.isEmpty() || stack.pop()!=dict.get(word.charAt(i))) return false;
            }
        }
        return stack.isEmpty();
    }
}
