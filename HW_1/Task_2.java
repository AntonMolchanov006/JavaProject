package HW_1;

public class Task_2 {
    public static void main(String[] args) {
        //Вывести все простые числа от 1 до 1000

        for (int i = 1; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j == 0) flag = false;
            }

            if (flag == true) System.out.print(i + " ");

        }
    }
}
