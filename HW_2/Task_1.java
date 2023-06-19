package HW_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        //Дана строка sql-запроса "select * from students where ". 
        //Сформируйте часть WHERE этого запроса, используя StringBuilder. 
        //Данные для фильтрации приведены ниже в виде json-строки.
        //Если значение null, то параметр не должен попадать в запрос.
        //Параметры для фильтрации: 
        //{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        //Пример вывода: "select * from students WHERE name = Ivanov AND country = Russia.....".

        String order = "select * from students where ";
        String filter = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        
        
    }
}
