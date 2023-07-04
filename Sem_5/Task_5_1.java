package Sem_5;

import java.util.HashMap;
import java.util.Map;

public class Task_5_1 {
    public static void main(String[] args) {
        //Cоздать структуру для хранения номеров паспортов и фамилий сотрудников компании.
        // 123456 Иванов
        // Вывести данные по фамилии Иванов.

        Map <Integer, String> db = new HashMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Сидоров");
        db.put(231456, "Петров");
        db.put(123654, "Иванов");
        db.put(123987, "Смирнов");
        db.put(123634, "Быков");
        db.put(123876, "Ивано");

        System.out.println(db);

        for(var item : db.entrySet()){
            if(item.getValue().equals("Иванов")){
                System.out.printf("[%d : %s]\n", item.getKey(), item.getValue());
            }
        }


    }
}
