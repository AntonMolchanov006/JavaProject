package Sem_1;

import java.nio.charset.Charset;
import java.util.Scanner;

public class sem_1 {
    public static void main(String[] args) {
        // int a = 5;
        // a = a-- - --a; // a=5-3
        // System.out.println(a);

        // Написать функцию, кторая запросит имя пользователя
        // и выведет сообщение :"Привет, {name}"
        // System.out.print("Введите имя: ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Привет, " + name);
        // System.out.printf("Привет, %s", name);

        //Дан массив двоичных чисел, например [1,1,0,1,1,1], 
        //вывести максимальное количество подряд идущих 1.
        /*
        int [] arr =  {1,1,0,1,1,1,0,1,1,1,1,1,0,1};
        int count = 0;
        int res = 0;
        for (int i= 0;  i < arr.length; i++ ){
            if (arr[i] == 1){
                count++;
                if (count > res){
                    res = count;
                }
                
            }
            else count = 0;

        }
        System.out.println(res);
        */

//Дан массив nums = [3,2,4,3,1,5,3,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

//[2,4,1,5,3,3,3,3]
//C использованием только 1 массива
        int [] array = {1,3,2,3,5,4,3,1,5,3,3};
        int val = 3;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-1; j++) {
                if(array[j] == val){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }   
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//         int count = 0;//4

// for (int i = 0; i < arr.length; i++)
// if (arr[i] != val) {
// arr[count++] = arr[i];
// }

// while (count < arr.length)
// arr[count++] = val;

// for (int i : arr) {
// System.out.println(i);
// }

    }
}
