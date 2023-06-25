package Sem_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sem_3_1 {
    public static void main(String[] args) throws IOException {
        // Заполнить список названиями планет солнечной системы в произвольном порядке
        // с повторениями. Вывести названия планет и количество поторений.

        ArrayList Planets = new ArrayList<String>(Arrays.asList("Земля", "Земля", "Юпитер", "Марс", "Юпитер", "Земля"));
        ArrayList ColPlan = new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", 
                                                            "Юпитер", "Уран", "Нептун", "Сатурн"));
        int count;
        for (Object planets : ColPlan) {
            count=0;
            count = Collections.frequency(Planets, planets);  //читерский способ
            // for (Object plan : Planets) {
            //     if(planets.equals(plan)){
            //         count++;
            //     }
            // }
            if(count > 0){
                System.out.println(planets + ": " + count);
            }
            
        }

    }
}
