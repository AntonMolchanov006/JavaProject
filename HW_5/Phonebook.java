package HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap.
        // Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
        // Пример ввода:
        // Иванов 234234
        // Иванов 32523
        // Иванов 5687
        // Иванов: 234234, 32523, 5687

        // Варианты Map:
        // Map<String, ArrayList>
        // Map<String, String>

        // Пример меню:
        // 1. Добавить контакт
        // 2. Вывести всех
        // 3. Выход

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        boolean flag2 = true;
        Map <String, ArrayList> pb = new HashMap<>();
        String surname;
        int number;
        while(flag){
            ArrayList <Integer> phones = new ArrayList<>();
            System.out.println("Выберите пункт из меню:");
            System.out.println("1. Добавить контакт.");
            System.out.println("2. Вывести всех.");
            System.out.println("3. Выход");
            System.out.print("Введите номер пункта: ");
            int answer = sc.nextInt();
            if(answer == 1){
                System.out.print("Введите фамилию: ");
                surname = sc.nextLine();
                if(pb.containsKey(surname)){
                    
                    while(flag2){
                        System.out.println("Введите номер телефона: ");
                        number = sc.nextInt();
                        if(number!=0){
                            phones.add(number);
                            System.out.println(phones);
                        } else flag2 = false;
                        // продумать выход из цикла
                    }
                }
            } else if(answer == 2){
                // выводим Map с сортировкой
            } else if(answer == 3){
                flag = false;
            } else System.out.println("Неверный ввод.");
            
        }
    }
}
